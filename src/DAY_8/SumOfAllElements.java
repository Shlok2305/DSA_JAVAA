package DAY_8;
import java.util.Scanner;
public class SumOfAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int sum = 0 ;
        for (int i = 0 ;i<n;i++){
            sum = arr[i]+sum;
        }
        System.out.println(sum);

    }
}