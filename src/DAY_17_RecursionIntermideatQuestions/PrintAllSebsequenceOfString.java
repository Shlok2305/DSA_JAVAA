package DAY_17_RecursionIntermideatQuestions;

public class PrintAllSebsequenceOfString {
    public static void subsequence(String str,int idx,String newString){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // Wether a char will be in the new String
        subsequence(str,idx+1,newString+currChar);
        // Wether a char will not be in the new String
        subsequence(str,idx+1,newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequence(str,0,"");
    }
}
