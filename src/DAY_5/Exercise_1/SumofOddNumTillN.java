package DAY_5.Exercise_1;

import java.util.Scanner;

public class SumofOddNumTillN {
    public static void PrintSumOddNumbers(int n){
        int sum =0;
        for(int i=0;i<=n;i++){
            if(i%2>0){
                sum =sum +i;
            }
        }System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PrintSumOddNumbers(n);
    }
}
