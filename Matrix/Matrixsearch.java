package Matrix;
import java.util.*;
public class Matrixsearch {
    public static void main(String[] args) {
         int[][] mat={{3,2,1},
                      {4,5,6},
                      {7,8,9}};
         int k=5;
         System.out.println(Arrays.toString(search(mat,3,k)));
    }
    static int[] search(int[][] mat,int n,int target)
    {
        // int r=0;
        // int c=mat[0].length-1;
        // while(r<n && c>=0)
        // {
        //     if(mat[r][c]==target)
        //     {
        //         return new int[]{r,c};
        //     }
        //     if(mat[r][c]<target){
        //         r++;
        //     }
        //     else{
        //         c--;
        //     }
        // }
        int r=0;
        int c=mat[0].length-1;
        while(r<n && c>=0)
        {
            if(mat[r][c]==target)
            {
                return new int[]{r,c};
            }
            if(mat[r][c]<target)
            {
                r++;
            }
            else{
               c--;
            }
        }
        return new int[]{-1,-1};
    }
}
