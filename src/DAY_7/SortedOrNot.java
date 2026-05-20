package DAY_7;
import java.util.Scanner;
public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i= 0 ; i<size;i++){
            numbers[i]=sc.nextInt();
        }

        boolean IsAscending = true;

        for (int i= 0 ; i<size -1;i++){
            if(numbers[i]>numbers[i+1]){
                IsAscending = false;
            }
        }
        if (IsAscending){
            System.out.println("Sorted");
        }else {
            System.out.println("Not Sorted");
        }
    }
}
