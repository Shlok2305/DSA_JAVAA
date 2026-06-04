package DAY_18_RecursionHardProblems;

public class CountTotalPathInAMatrix {
    public static int CountPath(int i ,int j, int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if(i== n-1 && j==m-1){
            return 1;
        }
        int DownPath= CountPath(i+1,j,n,m);
        int RightPath = CountPath(i,j+1,n,m);

        return DownPath+RightPath;
    }

    public static void main(String[] args) {
        int n = 3,m=4;
        System.out.println(CountPath(0,0,n,m));
    }
}
