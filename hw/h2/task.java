package hw.h2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

import java.io.FileWriter;

public class task {
    public static void main(String[] args) throws Exception {
        int[] a = FileRead("input.txt");
        System.out.println(a[0]);
        System.out.println(a[1]);
        int res = Power(a);
        System.out.println(res);
        FileWrite(res);
    }

    public static int[] FileRead(String filename) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line1 = br.readLine();
        String line2 = br.readLine();
        String[] str1 = line1.split(" ");
        String[] str2 = line2.split(" ");
        int[] arr = new int[2];
        br.close();

        if (str1[0] == "a") {

            arr[0] = Integer.parseInt(str1[1]);
            arr[1] = Integer.parseInt(str2[1]);

        } else {

            arr[0] = Integer.parseInt(str2[1]);
            arr[1] = Integer.parseInt(str1[1]);
            
        }

        return arr;
    }

    public static int Power(int[] array) {
        
        int a = array[0];
        int b = array[1];

        for (int i = 1; i < b; i++) {
            a = a * array[0];
        }

        return a;
    }

    public static void FileWrite(int result) throws Exception {
        try (FileWriter fw = new FileWriter("output.txt", false)) {

            String str = Integer.toString(result);
            fw.write(str);
            
            fw.flush();
            } catch (IOException ex) {
            System.out.println(ex.getMessage());
            }
    }
}



