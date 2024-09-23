package Backtracking;

public class N_Queens {
    public static void main(String[] args) {
      int n=4;
      boolean[][] board=new boolean[n][n];
      System.out.println(queens(board,0));
    }
    static int queens(boolean[][] board,int row)
    {
        if(row==board.length)
        {
            Display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col<board[0].length;col++)
        {
              if(isSafe(board,row,col))
              {
                board[row][col]=true;
                count+=queens(board,row+1);
                board[row][col]=false;
              }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board,int row,int col)
    {
        for(int i=row;i>=0;i--)
        {
            if(board[i][col])
            {
                return false;
            }
        }
        int minleft=Math.min(row,col);
        for(int j=0;j<=minleft;j++)
        {
            if(board[row-j][col-j])
            {
                return false;
            }
        }
        int minRight=Math.min(row,board.length-col-1);
        for(int k=0;k<=minRight;k++)
        {
            if(board[row-k][col+k])
            {
                return false;
            }
        }
        return true;
    }
    static void Display(boolean[][] board)
    {
        for(boolean[] n:board)
        {
            for(boolean m:n)
            {
                if(m)
                {
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
