package DAY_8;
import java.util.Scanner;
public class SecondLargestNoumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];


        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;

        for(int i = 0 ;i<size  ; i++){
            if (max<numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(max);

        int sl = Integer.MIN_VALUE;

        for (int i =0 ;i<size;i++){
            if (numbers[i]<max&& sl<max){
                sl = numbers[i];
            }
        }
        System.out.println("Second Largest Noumber is "+sl);

    }

}
