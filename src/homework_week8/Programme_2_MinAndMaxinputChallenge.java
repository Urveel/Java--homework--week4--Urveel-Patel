package homework_week8;

import java.util.Scanner;


    public class Programme_2_MinAndMaxinputChallenge{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            while (true) {
                System.out.print("Enter number: ");
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                } else {
                    break; // Break out of the loop on invalid input
                }
            }

            if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
                System.out.println("No valid numbers entered.");
            } else {
                System.out.println("Minimum number: " + min);
                System.out.println("Maximum number: " + max);
            }

            scanner.close();
        }
    }


