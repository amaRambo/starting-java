package before.seminars.sem1;

public class task1 {
    public static void main(String[] args){
        
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if (arr[i]%2==0) {
                count += 1;
            }
            System.out.printf(arr[i] + ",");
        }
        System.out.println(count);

        int[] arr2 = new int[count];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]%2==0) {
                    arr2[i]=arr[j];
                    System.out.printf(arr2[j] + ",");
                }
            }
        
        }
        
        // for (int j2 = 0; j2 < arr2.length; j2++) {
        //     System.out.println(arr2[j2]);
        // }
    }
    
}
