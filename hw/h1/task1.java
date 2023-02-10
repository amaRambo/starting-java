package hw.h1;
import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
    }
    

    public static int input(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    public static int work(String[] args) {
        int n = input("Введите n: ");
        int result = n*(n + 1)/2;
        System.out.println(result);
        return result;
    }
    
    void outputResult() {
        System.out.println();
    }
}