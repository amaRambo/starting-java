package tink;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        
        Integer value1 = Integer.parseInt(inPut());
        Integer value2 = Integer.parseInt(inPut());
        Integer result = value1 + value2;
        System.out.println(result);
    }

    public static String inPut() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
