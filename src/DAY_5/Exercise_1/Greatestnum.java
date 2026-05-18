package DAY_5.Exercise_1;
import java.util.Scanner;
public class Greatestnum {
    public static void GreatestOfTwo(int a,int b){
        if(a>b){
            System.out.println(a+" Is Greater");
        }else{
            System.out.println(b +" Is Greater");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        GreatestOfTwo(a,b);
    }
}
