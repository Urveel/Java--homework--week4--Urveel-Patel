package homework_week8;
/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
import java.util.Scanner;

public class Programme_6_NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        for(int i = 1; i <= rows; i++){
            //Print numbers from 1 to i in each row
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
