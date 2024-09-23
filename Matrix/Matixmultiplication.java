package Matrix;

public class Matixmultiplication {
    public static void main(String[] args) {
        int[][] mat1={{1,1},
                      {2,2}};
        int[][] mat2={{1,1},
                      {2,2}};
     int n=2;
     int m=2;
     int p=2;
     int q=2;
     if(n!=q)
     {
        System.out.println("cant multiply");
     }
     else{
        multiply(mat1,mat2,n,m,p,q);
     }
    }
    static void multiply(int[][] mat1,int[][] mat2,int n,int m,int p,int q)
    {
        int i,j,k;
        int[][] ans=new int[m][q];
        for( i=0;i<m;i++)
        {
            for(j=0;j<q;j++)
            {
                for(k=0;k<p;k++)
                {
                
                    ans[i][j]+=mat1[i][k]*mat2[k][j];
                }
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        } 
    }
}
