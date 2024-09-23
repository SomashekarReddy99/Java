package Matrix;

public class Matrix180 {
    public static void main(String[] args) {
        int[][] mat={{3,2,1},
        {4,5,6},
        {7,8,9}};
        for(int i=mat[0].length-1;i>=0;i--)
        {
           for(int j=3-1;j>=0;j--)
           {
            System.out.print(mat[i][j]+" ");
           }
           System.out.println();
        }
    }
}
