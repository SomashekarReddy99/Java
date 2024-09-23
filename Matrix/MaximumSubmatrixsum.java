package Matrix;



public class MaximumSubmatrixsum {
    public static void main(String[] args) {
        int[][] mat={{-1,2,-3},
                     {-4,5,-6},
                     {-2,5,-6}};
      System.out.println(maxSum(mat));
    }
    static int maxSum(int[][] mat)
    {
        int row=mat.length;
        int col=mat[0].length;
       int max=Integer.MIN_VALUE;
       for(int top=0;top<row;top++)
       {
        int[] temp=new int[col];
        for(int bottom=top;bottom<row;bottom++)
        {
            for(int i=0;i<col;i++)
            {
                temp[i]+=mat[bottom][i];
            }
            int summax=kadane(temp);
            max=Math.max(max,summax);
        }
       }
       return max;
    }
    static int kadane(int[] temp)
  {
          int c=0;
          int ms=0;
          for(int i=0;i<temp.length;i++)
          {
              c=Math.max(c+temp[i],temp[i]);
              ms=Math.max(ms,c);
          }
          return ms;
  } 
}
