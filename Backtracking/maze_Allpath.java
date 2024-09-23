package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class maze_Allpath {
    public static void main(String[] args) {
        boolean[][] board={{true,true,true},
                           {true,true,true},
                           {true,false,true}};
                           int[][] path=new int[3][3];
         System.out.println(mazepath("",board,0,0));
         System.out.println(mazepathD("",board,path,0,0,1));
    }
    static ArrayList<String> mazepath(String p,boolean[][] board,int r,int c)
    {
        if(r==board.length-1 && c==board[0].length-1)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(!board[r][c])
        {
            return list;
        }
        board[r][c]=false;
        if(r<board.length-1)
        {
           list.addAll(mazepath(p+"D", board, r+1, c));
        }
        if(c<board[0].length-1)
        {
            list.addAll(mazepath(p+"R",board,r,c+1));
        }
        if(r>0)
        {
            list.addAll(mazepath(p+"U", board, r-1, c));
        }
        if(c>0)
        {
           list.addAll(mazepath(p+"L", board, r, c-1));
        }
         board[r][c]=true;
         return list;
    }
    static ArrayList<String> mazepathD(String p,boolean[][] board,int[][] path,int r,int c,int step)
    {
        if(r==board.length-1 && c==board[0].length-1)
        {
            path[r][c]=step;
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            System.out.println(p);
            for(int[] n:path)
            {
                System.out.println(Arrays.toString(n));
            }
            System.out.println();
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(!board[r][c])
        {
            return list;
        }
        board[r][c]=false;
        path[r][c]=step;
        if(r<board.length-1)
        {
           list.addAll(mazepathD(p+"D", board,path, r+1, c,step+1));
        }
        if(c<board[0].length-1)
        {
            list.addAll(mazepathD(p+"R",board,path,r,c+1,step+1));
        }
        if(r>0)
        {
            list.addAll(mazepathD(p+"U", board,path, r-1, c,step+1));
        }
        if(c>0)
        {
           list.addAll(mazepathD(p+"L", board,path,r, c-1,step+1));
        }
         board[r][c]=true;
         path[r][c]=0;
         return list;
    }
}
