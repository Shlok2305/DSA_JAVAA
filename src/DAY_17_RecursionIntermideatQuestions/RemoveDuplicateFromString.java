package DAY_17_RecursionIntermideatQuestions;

public class RemoveDuplicateFromString {
    public static boolean []map = new boolean[26];
    public static void removeDuplicate(int idx, String str, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            removeDuplicate(idx+1,str,newStr);
        }else {
            newStr += currChar;
            map[currChar-'a'] = true;
            removeDuplicate(idx+1,str,newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbckkdcedfhhed";
        removeDuplicate(0,str,"");
    }
}
