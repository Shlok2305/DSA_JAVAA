package DAY_17_RecursionIntermideatQuestions;

public class MoveXtoEndOfString {

    public static void EndWith(String str,int count,int idx,String newstr,char element){
        if(idx ==str.length()){
            for(int i = 0;i<count;i++){
                newstr += element;
            }
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == element){
            count++;
            EndWith(str,count,idx+1,newstr,element);
        }else{
            newstr += currchar;
            EndWith(str,count,idx+1,newstr,element);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        EndWith(str,0,0,"",'x');
    }
}
