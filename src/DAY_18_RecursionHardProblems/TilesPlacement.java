package DAY_18_RecursionHardProblems;

public class TilesPlacement {
    public static int PlaceTiles(int n ,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        // Vertically
        int vertically = PlaceTiles(n-m,m);
        // Horezontal
        int horezontal = PlaceTiles(n-1,m);

        return vertically+horezontal;
    }

    public static void main(String[] args) {
        int n =4 ,m =2;
        System.out.println(PlaceTiles(n,m));
    }
}
