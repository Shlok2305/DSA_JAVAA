package DAY_17_RecursionIntermideatQuestions;

public class CheckIfArrIsSorted {
    public static Boolean status = false;
    public static void SortedOrNot(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            if (status) {
                System.out.println("Array is Sorted");
            } else {
                System.out.println("Array is not Sorted");
            }
            return;
        }

        if (arr[idx] <= arr[idx + 1]) {
            status = true;
        }
        SortedOrNot(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        SortedOrNot(arr,0);
    }
}