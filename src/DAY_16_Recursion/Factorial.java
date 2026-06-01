package DAY_16_Recursion;

public class Factorial {
    public static int calcuFactorial(int n){
        if (n ==1 || n==0){
            return 1;
        }
        int fact_nm1= calcuFactorial(n-1);
        int fact = n* fact_nm1;
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int factorial = calcuFactorial(n);
        System.out.println(factorial);
    }
}
