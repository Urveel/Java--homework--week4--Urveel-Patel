package homework_week8;

import java.util.Scanner;

public class Programme_1_ReadNumbersAndSums {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

                int count = 1;
                int sum = 0;

                while (count <= 10) {
                    System.out.print("Enter number #" + count + ": ");
                    if (scanner.hasNextInt()) {
                        int number = scanner.nextInt();
                        sum += number;
                        count++;
                    } else {
                        System.out.println("Invalid Number");
                        scanner.nextLine(); // Clear the input buffer
                    }
                }

                System.out.println("The sum of the 10 numbers is: " + sum);
                scanner.close();
            }
        }



