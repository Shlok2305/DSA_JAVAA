package DAY_16_Recursion;

public class Recursion1To5 {
    public static void PrintNumber(int n){
        if (n>5){
            return;
        }
        System.out.print(n+" ");
        PrintNumber(n+1);
    }

    public static void main(String[] args) {
        int n= 1;
        PrintNumber(n);
    }
}
