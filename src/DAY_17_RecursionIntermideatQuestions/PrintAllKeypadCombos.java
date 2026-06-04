package DAY_17_RecursionIntermideatQuestions;

public class PrintAllKeypadCombos {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};
    public static void printCombination(String str,int idx,String Combinations){
        if (idx == str.length()){
            System.out.println(Combinations);
            return;
        }
        char currChar = str.charAt(idx);
        String map = keypad[currChar - '0'];
        for(int i =0 ;i<map.length();i++){
            printCombination(str,idx+1,Combinations+map.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printCombination(str,0,"");

    }
}
