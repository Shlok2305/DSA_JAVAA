package DAY_11;
import java.util.*;
public class PowerOfNo {
    public static int PowerOfNumber(int a, int x) {
        int power = a;
        for (int i = 1; i < x; i++) {
            power = power * a;
        }
        System.out.println(power);
        return power;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();

        PowerOfNumber(a,x);

    }
}
