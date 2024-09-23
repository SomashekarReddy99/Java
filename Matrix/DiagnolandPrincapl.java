package Matrix;

import java.util.Arrays;

public class DiagnolandPrincapl {
    public static void main(String[] args) {
        int[][] mat=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat[i][j]=(int)(Math.random()*100);
            }
        }
        for(int[] n:mat)
        {
            System.out.println(Arrays.toString(n));
        }
          for(int i=0;i<3;i++)
          {
            System.out.println(mat[i][i]+" ");
          }
          for(int i=0;i<3;i++)
          {
              for(int j=0;j<3;j++)
              {
                if(i+j==mat.length-1)
                {
                    System.out.print(mat[i][j]+" ");
                }
              }
            }
            for(int i=0;i<3;i++)
          {
              for(int j=0;j<3;j++)
              {
                if(i==j)
                {
                    mat[i][j]=50;
                }
              }
            }
            for(int[] n:mat)
        {
            System.out.println(Arrays.toString(n));
        }
        int[] temp=new int[3*3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                temp[i*3+j]=mat[i][j];
            }
        }
        System.out.println(Arrays.toString(temp));
     
    }


}
