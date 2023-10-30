package homework_week8;

public class Programme_5_PalindromeNumber {
    public static boolean programme_5_PalindromeNumber(int number){
   int originalNumber = number;
   int reverse = 0;
   while (number !=0){
       int lastDigit = number % 10;
       reverse = (reverse*10) + lastDigit;
       number/=10;
   }
   return originalNumber==reverse;

    }

    public static void main(String[] args) {

        System.out.println(programme_5_PalindromeNumber(-1221));
        System.out.println(programme_5_PalindromeNumber(707));
        System.out.println(programme_5_PalindromeNumber(11212));
    }
}
