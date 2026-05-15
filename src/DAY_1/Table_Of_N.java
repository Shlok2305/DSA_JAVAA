package DAY_1;
import java.util.Scanner;
public class Table_Of_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Enter a number ");
        n = sc.nextInt();

        for(i= 0 ; i <11;i ++ ){
            System.out.println(n + " * " + i  + " = "+ n * i  );
        }
    }
}
