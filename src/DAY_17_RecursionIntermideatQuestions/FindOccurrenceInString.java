package DAY_17_RecursionIntermideatQuestions;

public class FindOccurrenceInString {
    public static int first = -1;
    public static int last = -1;
    public static void FindOccurrence(int idx,String str,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currele = str.charAt(idx);
        if(currele==element){
            if(first==-1){
                first =idx;
            }
            else {
                last = idx;
            }
        }
        FindOccurrence(idx+1,str,element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        FindOccurrence(0,str,'a');
    }
}
