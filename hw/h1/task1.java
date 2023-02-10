package hw.h1;
import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // outputResult(work(input(text: "Введите n: ")));
        int a = input("Введи n: ");
        int res = work(a);
        outputResult(res);
    }
    

    public static int input(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    public static int work(int args) {
        int n = args;
        int result = n*(n + 1)/2;
        return result;
    }
    
    static void outputResult(int arg) {
        System.out.println(arg);
    }
}