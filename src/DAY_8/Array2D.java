package DAY_8;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();


        int [][] numbers = new int[n][m];

        for (int i = 0 ; i <3;i++){
            for (int j = 0 ;j<5;j++){
                numbers [i][j]=sc.nextInt();
            }

        }
        for (int i = 0 ; i <3;i++){
            for (int j = 0 ;j<5;j++) {
                System.out.print(numbers[i][j] +" ");
            }
            System.out.println();
        }

    }
}
