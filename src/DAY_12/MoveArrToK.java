package DAY_12;
import java.util.*;
public class MoveArrToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Rotation

        int[] RotBy=new int [n];
        for (int i = 0;i<n;i++){
            RotBy[(i+k)%n]= arr[i];

        }
        for (int i = 0;i<n;i++){
            System.out.print(RotBy[i]+" ");
        }
    }
}
