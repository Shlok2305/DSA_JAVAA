package DAY_14;
import java.util.Scanner;
public class Count1sInBitRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        int pos = 0;
        int count = 0;

        for (int i = 0;i<32;i++){
            int bitmask = 1<<i;
            int num = bitmask&n;
            if (num>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
