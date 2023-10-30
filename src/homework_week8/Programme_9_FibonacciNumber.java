package homework_week8;

public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        int n =8;
        int firstNumber =1;
        int secondNumber =1;
        System.out.println(firstNumber + " "+ secondNumber + " ");
        for (int i = 3; i<=n; i++){
            int nextNumber = firstNumber + secondNumber;
            System.out.println(nextNumber +" ");
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
    }
}
