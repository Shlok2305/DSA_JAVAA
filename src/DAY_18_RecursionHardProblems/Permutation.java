package DAY_18_RecursionHardProblems;

public class Permutation {
    public static void PrintPermutation(String str,String permutation){
        if(str.isEmpty()){
            System.out.println(permutation);
            return;
        }

        for(int i =0;i<str.length();i++){
            char currChar= str.charAt(i);
            //"abc"->"ab"
            String nerStr= str.substring(0,i)+str.substring(i+1);
            PrintPermutation(nerStr,permutation+currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        PrintPermutation(str,"");
    }
}
