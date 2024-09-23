package Backtracking;

public class Maze_route {
    public static void main(String[] args) {
        System.out.println(path(3,3));
    }
    static int path(int r ,int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int count=0;
        if(r>0)
        {
            count+=path(r-1,c);
        }
        if(c>0)
        {
            count+=path(r,c-1);
        }
        return count;
    }
}
