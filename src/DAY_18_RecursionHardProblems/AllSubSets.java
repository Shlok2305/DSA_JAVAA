package DAY_18_RecursionHardProblems;

import java.util.ArrayList;

public class AllSubSets {
    public static void PrintSubset(ArrayList<Integer> subset){
        for(int i=-0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void PrintSubsets(int n , ArrayList<Integer> subset ){
        if(n==0){
            PrintSubset(subset);
            return;
        }
        //Add hoga
        subset.add(n);
        PrintSubsets(n-1,subset);
        //Add Nahi hoga
        subset.remove(subset.size()-1);
        PrintSubsets(n-1,subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        PrintSubsets(n,subset);
    }
}
