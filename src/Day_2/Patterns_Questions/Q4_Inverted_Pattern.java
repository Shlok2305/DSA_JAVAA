package Day_2.Patterns_Questions;

public class Q4_Inverted_Pattern {
    public static void main(String[] args) {
        int n = 4;

        for(int i = 1; i<=n; i++ ){

            for(int j=n;j>=i;j--){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
