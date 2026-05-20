package DAY_7;
import java.util.Scanner;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];


        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ;i<size  ; i++){
            if (max<numbers[i]){
                max = numbers[i];
            }
            if (min>numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }



}