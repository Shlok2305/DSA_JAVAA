package DAY_16_Recursion;

public class SumOfNNaturalNumbers {
    public static void SumTillN(int i,int n,int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        SumTillN(i+1,n,sum);
//        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int sum = 0;
        SumTillN(i,n,sum);
    }
}
