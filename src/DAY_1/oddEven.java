package DAY_1;
import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();

        if ( num % 2 == 0){
            System.out.println("number is even");
        }
        else {
            System.out.println("ood");
        }
    }
}
