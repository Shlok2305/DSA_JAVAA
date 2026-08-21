package DAY_6;
//import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=0;
        int [] nums = {1,2,3,4};
        int [] left = new int [nums.length];
        int [] right = new int [nums.length];
//        int [] answer = new int [nums.length];
        int lp = 1;
        int rp = 1;
        for(int i = 0;i<nums.length;i++){
            left[i] = lp;
            lp = lp*nums[i];
        }
        for(int i =nums.length-1;i>=0;i--){
            right[i] = rp;
            rp = rp*nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            System.out.print(left[i]+" ");
        }
        System.out.println();
        for(int i = 0;i<nums.length;i++){
            System.out.print(right[i]+" ");
        }

    }
}
