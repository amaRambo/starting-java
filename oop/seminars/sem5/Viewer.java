package oop.seminars.sem5;

import java.util.Scanner;

public class Viewer {

    Scanner scan = new Scanner(System.in);
    
    public Viewer() {

    }

    public int getValue(String msg) {
        System.out.printf("%s", msg);
        return scan.nextInt();
    }

    public void print(Double result, String msg) {
        System.out.printf("%s %f\n", msg, result);
    }

    // public int Menu(String msg) {
    //     System.out.printf("%s", msg);
    //     return scan.nextInt();
    // }
    
}
