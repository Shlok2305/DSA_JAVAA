package DAY_13;
import java.util.Scanner;
public class BitManipulationUpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int i = 1;
        int bitMask = 1<<i;
        int opp = sc.nextInt();

        if(opp == 1){
            int newno = bitMask | n;
            System.out.println(newno);
        }else {
            int notBitMask = ~(bitMask);
            int newno = notBitMask & n;
            System.out.println(newno);
        }
    }
}
