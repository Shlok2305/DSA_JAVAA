package DAY_20_HashSet;

import java.util.HashSet;

public class Intersection {
    public static int union(int []arr1,int []arr2){
        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        for (int i = 0 ;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int i = 0 ;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                set.remove(arr2[i]);
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int [] arr1 = {7,3,9};
        int [] arr2 ={6,3,9,2,9,4};
        int result = union(arr1,arr2);
        System.out.println(result);
    }
}

