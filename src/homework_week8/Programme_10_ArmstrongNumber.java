package homework_week8;

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (isArmStrongNumber(number)){
            System.out.println(number + "is an Armstrong number. ");
        }else{
            System.out.println(number + "is not an Armstrong number.");
        }
        scanner.close();
    }
    public static boolean isArmStrongNumber(int num){
        int originalNum = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum +=Math.pow(digit, numDigits);
            num /=10;
        }
        return sum ==originalNum;
    }
}
