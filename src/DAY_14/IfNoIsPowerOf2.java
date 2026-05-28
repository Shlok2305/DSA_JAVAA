package DAY_14;
import java.util.*;
public class IfNoIsPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if ( (n&(n-1))==0){
            System.out.println("Number power is 2");
        }else {
            System.out.println("It does not have Power two");
        }
    }
}
