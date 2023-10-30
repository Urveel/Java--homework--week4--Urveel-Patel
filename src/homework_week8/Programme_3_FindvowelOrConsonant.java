package homework_week8;

import java.util.Scanner;

public class Programme_3_FindvowelOrConsonant {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input an alphabet : ");
        String input = scanner.nextLine();
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char letter = Character.toLowerCase(input.charAt(0));

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error: Input is not a single letter.");
        }

        scanner.close();
    }
}
