package DAY_12;
import java.util.Scanner;
public class ReplaceEWithIInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String og = sc.next();
        String result = "";

        for (int i = 0 ;i<og.length();i++){
            if (og.charAt(i)=='e'){
                result += 'i';
            }else{
                result += og.charAt(i);
            }
        }
        System.out.println(result);
    }
}
