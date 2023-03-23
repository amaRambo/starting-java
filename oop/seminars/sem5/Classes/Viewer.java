package oop.seminars.sem5.Classes;

import java.util.Scanner;

public class Viewer {

    Scanner scan = new Scanner(System.in);
    
    public Viewer() {

    }

    public String getValue(String msg) {
        System.out.printf("%s", msg);
        return scan.nextLine();
    }

    public void print(Double result, String msg) {
        System.out.printf("%s %s\n", msg, result);
    }
    
}
