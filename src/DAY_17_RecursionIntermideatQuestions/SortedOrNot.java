package DAY_17_RecursionIntermideatQuestions;

public class SortedOrNot {
    public static Boolean sortedOrNot(int[] arr,int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]<=arr[idx+1]){
            return sortedOrNot(arr,idx+1);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};

        System.out.println(sortedOrNot(arr,0));
    }
}
