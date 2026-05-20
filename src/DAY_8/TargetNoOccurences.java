package DAY_8;

import java.util.Scanner;

public class TargetNoOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("/n"+"target");
        int target= sc.nextInt();
        int occ = 0;
        for (int i = 0; i < n; i++){
            if(target==arr[i]){
                occ++;
            }
        }
        System.out.println(occ);
    }
}
