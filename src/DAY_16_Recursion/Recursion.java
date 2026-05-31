package DAY_16_Recursion;

public class Recursion {
    public static void PrintNumber(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        PrintNumber(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        PrintNumber(n);
    }
}
