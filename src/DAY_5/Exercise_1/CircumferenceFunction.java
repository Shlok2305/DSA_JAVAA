package DAY_5.Exercise_1;
import java.util.Scanner;
public class CircumferenceFunction {
    public static double Circumference(float r){
        return (2*3.14)*r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r = sc.nextInt();

        double c = Circumference(r);
        System.out.println(c);

    }
}
