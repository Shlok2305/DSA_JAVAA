package DAY_1;
import java.util.Scanner;
public class CalculatorBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        float a = sc.nextFloat();
        System.out.println("Enter Operator");
        char op = sc.next().charAt(0);
        System.out.println("Enter Second Number");
        float b = sc.nextFloat();

        switch (op){
            case '*': System.out.println( a * b);
            break;
            case '-': System.out.println( a - b );
            break;
            case '+': System.out.println( a + b );
            break;
            case '/': System.out.println( a / b );
            break;
            default:
                System.out.println("invalid");
        }
    }
}
