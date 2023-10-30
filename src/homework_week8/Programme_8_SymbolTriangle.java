package homework_week8;

public class Programme_8_SymbolTriangle {
    public static void main(String[] args) {
        int numRows =5;
        for (int i=1;i<=numRows; i++){
            for (int j = 1;j<=i; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
