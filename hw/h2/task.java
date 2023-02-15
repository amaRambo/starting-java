package hw.h2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class task {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line1 = br.readLine();
        String line2 = br.readLine();
        String[] str1 = line1.split(" ");
        String[] str2 = line2.split(" ");
        System.out.println(line1);
        br.close();
    
    }

    // public static int[] FileRead(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new FileReader("hw/h2/input.txt"));
    //     String line1 = br.readLine();
    //     String line2 = br.readLine();
    //     String[] str1 = line1.split(" ");
    //     String[] str2 = line2.split(" ");
    //     System.out.println(line1);
    //     br.close();

    // }
}
