package DAY_9;
import java.util.Scanner;
public class All0AtTheEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];


        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int index =0;
        for (int i = 0; i < n; i++){
            if (numbers[i]!=0){
                numbers[index]=numbers[i];
                index++;
            }
        }
        for(int i = index;i<n;i++){
            numbers[i]=0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
