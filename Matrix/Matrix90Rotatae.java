package Matrix;

import java.util.Arrays;

public class Matrix90Rotatae {
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
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3/2;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[i][3-1-j];
                mat[i][3-j-1]=temp;
            }
        }
        for(int[] n:mat)
        {
            System.out.println(Arrays.toString(n));
        }
        for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<3;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3/2;j++)
            {
                int temp=mat[j][i];
                mat[j][i]=mat[3-j-1][i];
                mat[3-j-1][i]=temp;
            }
        }
        for(int[] n:mat)
        {
            System.out.println(Arrays.toString(n));
        }
       }
}