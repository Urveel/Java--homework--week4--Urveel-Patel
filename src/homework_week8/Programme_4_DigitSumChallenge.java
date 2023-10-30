package homework_week8;

public class Programme_4_DigitSumChallenge {
public static int sumDigits(int number){
    if(number<10 || number< 0){

    }
    int sum = 0;
    while(number>0){
        int digit = number % 10;
        sum +=digit;
        number/=10;

    }
    return sum;


}

    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(-123));
    }

}
