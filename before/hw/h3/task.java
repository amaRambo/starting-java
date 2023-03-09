package before.hw.h3;

import java.util.Arrays;

public class task {
    public static void main(String[] args) {
        
        int[] array = {231,12,32,2,432,543,23,45,43,4234,56,345,546,345,7,23,7,4,34,5435,45,345,56,45};
        int[] res = mergeSort(array);
        System.out.println(Arrays.toString(res));

    }

    static public int[] mergeSort(int[] array) {

        int[] buf1 = Arrays.copyOf(array, array.length);
        int[] buf2 = new int[array.length];
        int[] res = mergeSortInner(buf1, buf2, 0, array.length);
        return res;

        }

    public static int[] mergeSortInner(int[] buf1, int[] buf2, int start_index, int end_index) {

        if (start_index >= end_index - 1) {
            return buf1;
        }

        int mid = start_index + (end_index - start_index) / 2;
        int[] sorted1 = mergeSortInner(buf1, buf2, start_index, mid);
        int[] sorted2 = mergeSortInner(buf1, buf2, mid, end_index);
        int ind1 = start_index;
        int ind2 = mid;
        int dest_ind = start_index;
        int[] res = sorted1 == buf1 ? buf2 : buf1;

        while (ind1 < mid && ind2 < end_index) {
            res[dest_ind++] = sorted1[ind1] < sorted2[ind2] ? sorted1[ind1++] : sorted2[ind2++]; 
        }

        while (ind1 < mid) {
            res[dest_ind++] = sorted1[ind1++];
        }

        while (ind2 < end_index) {
            res[dest_ind++] = sorted2[ind2++];
        }

        return res;
    }
}