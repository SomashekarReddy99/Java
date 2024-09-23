package Matrix;

public class Spiral {
    public static void main(String[] args) {
        int[][] mat={{3,2,1,8},
        {4,5,6,9},
        {7,8,9,0},
    {6,7,8,9}}
        ;
        int n=mat[0].length;
        int top=0;
        int down=n-1;
        int left=0;
        int right=n-1;
        while(top<=down && left<=right)
        {
           for(int i=left;i<=right;i++)
           {
             System.out.print(mat[top][i]+" ");
           }
           top++;
           for(int j=top;j<=down;j++)
           {
            System.out.print(mat[j][right]+" ");
           }
           right--;
           for(int k=right;k>=left;k--)
           {
            System.out.print(mat[down][k]+" ");
           }
           down--;
           for(int x=down;x>=top;x--)
           {
            System.out.print(mat[x][left]+" ");
           }
           left++;
        }
    }

}
