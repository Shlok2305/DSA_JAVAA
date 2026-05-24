package DAY_11;
import java.util.*;
public class MissingNoBetween1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];

        for(int i = 0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // missing No
        for(int i = 0 ;i<n-1;i++){
            if(arr[i+1]-arr[i]>1){
                for (int j =arr[i];j<arr[i+1]-1;j++){
                    System.out.println(arr[i]+1);
                    break;
                }
            }
        }
    }
}
