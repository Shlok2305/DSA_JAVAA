package DAY_1;
import java .util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Equal");
        }
        else if ( a>b) {
            System.out.println(a + " is bigger");
        }
        else{
            System.out.println(b + " is bigger");
        }

    }

    public static class table_of_n {
    }
}
