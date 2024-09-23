package Backtracking;

import java.util.ArrayList;

/**
 * Maze_path
 */
public class Maze_path {

    public static void main(String[] args) {
        ArrayList<String> ans=maze("",3,3);
      System.out.println(ans);
    System.out.println(mazeDiagnol("",3,3));
    }
    static ArrayList<String> maze(String p,int r ,int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> down=new ArrayList<>();
        ArrayList<String> right=new ArrayList<>();
        if(r>1)
        {
             down=maze(p+"D",r-1,c);
        }
        if(c>1)
        {
            right=maze(p+"R",r,c-1);
        }
        down.addAll(right);
        return down;
    }  
    static ArrayList<String> mazeDiagnol(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1)
        {
            list.addAll(mazeDiagnol(p+'D', r-1, c));
        }
        if(r>1 && c>1)
        {
            list.addAll(mazeDiagnol(p+"X", r-1, c-1));
        }
        if(c>1)
        {
            list.addAll(mazeDiagnol(p+"R", r, c-1));
        }
        return list;
    }  
}