package Matrix;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] mat={{3,2,1},
                     {4,5,6},
                     {7,8,9}};
  
    for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<3;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
      for(int[] n:mat) 
      {
        System.out.println(Arrays.toString(n));
      }             
    }

}
