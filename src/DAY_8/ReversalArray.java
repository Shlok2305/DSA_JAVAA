package DAY_8;
import java.util.Scanner;
public class ReversalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[]= new int[n];

        for (int i = 0 ; i<n;i++){
            arr[i]= sc.nextInt();
        }
        for (int i = 0 ; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Revalsal");

        int[] revalsal = new int[n];

        for (int i = 0 ; i<n;i++){
            revalsal[i]= arr[(n-i)-1];
            System.out.print(revalsal[i]+" ");
        }

    }
}
