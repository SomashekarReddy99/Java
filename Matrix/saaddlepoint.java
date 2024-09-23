package Matrix;

public class saaddlepoint {
    public static void main(String[] args) {
        int[][] mat = {
            {9,6,3},
            {40, 5, 4},
            {20, 10, 30}
        };
        int row=mat.length;
        int col=mat[0].length;
        for(int i=0;i<row;i++)
        {
            int minRow=mat[i][0];
            int colIndex=0;
            for(int j=1;j<col;j++)
            {
                if(minRow>mat[i][j])
                {
                    minRow=mat[i][j];
                    colIndex=j;
                }
            }
            boolean Saddle=true;
            for(int j=0;j<col;j++)
            {
                if(mat[i][colIndex]<mat[j][colIndex])
                {
                    Saddle=false;
                }
            }
            if(Saddle)
            {
                System.out.println(mat[i][colIndex]+" "+i+" "+colIndex);
            }
        }
    }
}
