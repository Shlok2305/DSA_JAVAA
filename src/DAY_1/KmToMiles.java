package DAY_1;
import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of KM");
        double km = sc.nextFloat();

        double mil = km * 0.68;

        System.out.println(km + " kilometer in "+ mil + " miles");

    }
}
