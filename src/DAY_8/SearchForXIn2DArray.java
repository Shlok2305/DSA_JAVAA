package DAY_8;
import java.util.Scanner;
public class SearchForXIn2DArray {
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
        System.out.println("Enter the number you want to find");
        int x = sc.nextInt();

        for (int i = 0 ; i <3;i++){
            for (int j = 0 ;j<5;j++) {
                if (numbers[i][j] == x) {
                    System.out.println(x+ " Was Found in " +i+" Row "+j+" Col");
                }
            }
        }

    }
}
