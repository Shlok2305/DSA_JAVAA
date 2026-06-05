package DAY_18_RecursionHardProblems;

public class NoOfWaysToCallNGuest {
    public static int CallGuest(int n){
        if (n <=1){//meaning 1 or 0
            return 1;
        }
        int Single = CallGuest(n-1);
        int Pairs =(n-1) *CallGuest(n-2);
        return Single+Pairs;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(CallGuest(n));
    }
}
