package hw.h1;
import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getNumberByUser("Введите n: ");
        int result = n*(n + 1)/2;
        System.out.println(result);
    }
    

    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }
    
}