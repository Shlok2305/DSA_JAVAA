package DAY_17_RecursionIntermideatQuestions;

public class ReverseAString {
    public static void Reverse(String n,int idx){
        if (idx ==0){
            System.out.print(n.charAt(idx));
            return;
        }
        System.out.print(n.charAt(idx)+" ");
        Reverse(n,idx-1);
    }

    public static void main(String[] args) {
        String n = "abcd";
//        int idx  = n.length()-1;
        Reverse(n,n.length()-1);
    }
}
