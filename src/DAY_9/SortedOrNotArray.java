package DAY_9;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SortedOrNotArray {
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
        boolean IsSorted = true;

        for (int i = 0; i < n-1; i++){
            if(numbers[i]>numbers[i+1]){
                IsSorted = false;
            }
        }
        if (IsSorted){
            System.out.println("Sorted");
        }else {
            System.out.println("not sorted");
        }
    }
}

