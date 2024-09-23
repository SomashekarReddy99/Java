package Matrix;

public class MiniumSubArraySum {
    public static void main(String[] args) {
        int[][] mat={{-1,2,3},
        {-4,5,6},
        {-2,5,6}};
        int row=mat.length;
        int col=mat[0].length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<row;i++)
        {
            int[] temp=new int[col];
            for(int j=i;j<row;j++)
            {
                for(int k=0;k<col;k++)
                {
                    temp[k]+=mat[j][k];
                }
               int mini=Kadane(temp);
              
                min=Math.min(min,mini);
            }
        }
        System.out.println(min);
    }
   static int Kadane(int[] temp)
   {
    int c=temp[0];
    int m=temp[0];
    for(int i=1;i<temp.length;i++)
    {
        c=Math.min(temp[i],c+temp[i]);
        m=Math.min(c,m);
    }
    return m;
   }
}
