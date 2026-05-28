package DAY_14;
import java.util.*;
public class BinaryToDecimalAndVicVersa {
    public static void DecimalToBinary(int n){
        boolean Started = false;
        for (int i = 31;i>=0;i--){
            int bitmask = 1<<i;
            int num = bitmask&n;
            if (num>0){
                Started = true;
                System.out.print(1);
            }else {
                if(Started){
                System.out.print(0);
                }
            }
        }
        System.out.println();
    }
    public static void BinaryToDecimal(int Binary){
        int pos = 0 ;
        int sum = 0;
        while (Binary>0){
            int bit = Binary%10;
            Binary = Binary/10;
            double num = bit * Math.pow(2,pos);
            pos++;
            sum += num;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int Binary = sc.nextInt();

        DecimalToBinary(n);
        BinaryToDecimal(Binary);
    }
}
