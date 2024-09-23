package Backtracking;

public class maze_path_count {
    public static void main(String[] args) {
        System.out.print(maze(3,3));
    }
    static int maze(int r,int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int left=maze(r-1,c);
        int right=maze(r,c-1);
        return left+right;
    }
}
