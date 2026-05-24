package DAY_10;
import java.util.*;
public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int se = 0;
        int gcd = 0;
        if(a>b){
            se = b;
        }else{
            se = a;
        }
        for (int i =se;i>0;i--){
            if(a%i ==0 && b%i ==0){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
    }
}
