package DAY_5;
import java.util.*;
public class Function_printName {
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        PrintMyName(name);
    }
}
