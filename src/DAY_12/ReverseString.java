package DAY_12;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String og = sc.next();
        String rev ="";
         for(int i = og.length()-1;i>=0;i--){
             rev += og.charAt(i);
         }
        System.out.println(rev);
    }
}
