package DAY_7;
import java.util.Scanner;

public class ArrayNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0 ;i< n;i++){
            names[i] = sc.next();
        }
        for(int i = 0 ;i< names.length;i++){
            System.out.println(names[i]);
        }

    }
}
