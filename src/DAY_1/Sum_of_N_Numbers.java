package DAY_1;
import java.util.Scanner;
public class Sum_of_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i , sum = 0;
        int n = sc.nextInt();

        for (i = 0 ; i<=n ; i++){
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
