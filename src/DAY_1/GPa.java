package DAY_1;
import java.util.Scanner;

public class GPa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sub1 , sub2, sub3,GPA,Sum;
        int cri , tc ;
        System.out.println("Enter Subject 1st marks");
        sub1 = sc.nextFloat();
        System.out.println("Enter Subject 2nd marks");
        sub2 = sc.nextFloat();
        System.out.println("Enter Subject 1rd marks");
        sub3 = sc.nextFloat();
        System.out.println("Enter sub Cridets");
        cri = sc.nextInt();
        System.out.println("Enter total Cridets");
        tc = sc.nextInt();


        Sum = sub1 + sub2 + sub3;
        GPA = (Sum * cri)/tc;

        System.out.println("GPA = " + GPA);
    }
}
