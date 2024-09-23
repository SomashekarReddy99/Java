package Backtracking;

import java.util.ArrayList;

public class Maze_route_map {
    public static void main(String[] args) {
        System.out.println(path("",0,0));
    }
    static ArrayList<String> path(String p,int r,int c)
    {
        if(r==2 && c==2)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r<3)
        {
          list.addAll(path(p+"D",r+1,c));
        }
        if(r<3 && c<3)
        {
            list.addAll(path(p+"X",r+1,c+1));
        }
        if(c<3)
        {
          list.addAll(path(p+"R",r,c+1));
        }
        return list;
    }
}
