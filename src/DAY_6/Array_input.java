package DAY_6;
import java.util.Scanner;
public class Array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size" );
        int n = sc.nextInt();
        int[] marks = new int[n];

        for(int i = 0 ;i<n;i++){
                System.out.println("enter"+(i+1)+"Element value of the arr");
                marks[i]= sc.nextInt();
        }
        for (int i = 0 ; i <n;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
