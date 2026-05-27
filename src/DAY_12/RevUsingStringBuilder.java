package DAY_12;
import java.util.*;
public class RevUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());

        for (int i = 0 ; i< sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char BackChar = sb.charAt(back);

            sb.setCharAt(front,BackChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
