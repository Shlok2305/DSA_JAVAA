package DAY_19_BackTracking;

public class Permutation {
    public static void PrintPermutation(String str,String perm,int idx){
        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i = 0 ;i<str.length();i++){
            char currrChar=str.charAt(i);
            String subString = str.substring(0,i)+str.substring(i+1);
            PrintPermutation(subString,perm+currrChar,idx+1);
        }
    }

    public static void main(String[] args) {
        String str ="ABC";
        PrintPermutation(str,"",0);
    }
}
