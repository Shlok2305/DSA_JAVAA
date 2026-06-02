package DAY_17_RecursionIntermideatQuestions;

public class TowerOfHonoi {
    public static void TOH(int n , String src, String helper,String dest){
        if (n == 1){
            System.out.println(n +" transferred to "+dest+" from "+src);
            return;
        }
        TOH(n-1,src,dest,helper);
        System.out.println(n +" transferred to "+dest+" from "+src);
        TOH(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        int n =3;
        TOH(n, "S", "H", "D");
    }
}
