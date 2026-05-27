package DAY_12;
import java.util.*;
public class CumalativeStringArrLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int length = 0 ;

        for (int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        //cumulative Length
        for (int i=0;i<n;i++){
            length += arr[i].length();
        }
        System.out.println(length);
    }
}
