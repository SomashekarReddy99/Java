package Matrix;

public class maxofroworcol {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
                     int row=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                row=Math.max(mat[i][j],row);
            }
            System.out.println(row);
            row=0;

        }
    }
 }

