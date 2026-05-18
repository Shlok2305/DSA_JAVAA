package DAY_6;
import java.util.Scanner;
public class FindElementOfArrar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int[] search= new int[n];
        System.out.println("Enter "+n+" numbers");
        for (int i = 0 ;i<n;i++){
            search[i]=sc.nextInt();
        }
        System.out.println("enter the number you want to search you want to know index of");
        int x = sc.nextInt();

        for (int i =0;i<n;i++){
            if(search[i]==x) {
                System.out.println(x + " Was in " + i + " Element");
                return;
            }

        }
    }
}
