package DAY_5.Exercise_1;
import java.util.*;
public class AverageOfNumFunction {
    public static float Average(float a,float b, float c) {
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = Average(a,b,c);
        System.out.println(avg);
    }
}
