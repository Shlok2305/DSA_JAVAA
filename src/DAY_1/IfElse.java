package DAY_1;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your Age");

        int age = sc.nextInt();

        if (age>=18){
            System.out.println("Adult");
        }
        else {
            System.out.println("U are not");
        }
    }
}
