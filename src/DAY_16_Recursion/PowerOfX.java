package DAY_16_Recursion;

public class PowerOfX {
    public static int PrintPower(int x, int n){
        if (n==0){
            return 1 ;
        }if(x == 0){
            return 0;
        }
        return x * PrintPower(x,n-1);


    }

    public static void main(String[] args) {
        int x =2 ,n=5;
        System.out.println(PrintPower(x,n));
    }
}
