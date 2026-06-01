package DAY_16_Recursion;

public class PowerOfX {
    public static int PrintPower(int x, int n){
        if (n==0){
            return 1 ;
        }

        return x * PrintPower(x,n-1);

    }

    public static void main(String[] args) {
        int x =5 ,n=3;
        System.out.println(PrintPower(x,n));
    }
}
