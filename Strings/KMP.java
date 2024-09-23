package Strings;

public class KMP {
    public static void main(String[] args) {
        String text="Somabcgf";
        String pattern="abc";
        match(text,pattern);
    }
    static void match(String text,String pattern)
    {
        int n=text.length();
        int m=pattern.length();
        for(int i=0;i<n-m+1;i++)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(text.charAt(i+j)!=pattern.charAt(j))
                {
                    break;
                }
            }
            if(j==m)
            {
                System.out.println(i+" "+(i+m-1));
            }
        }

    }
}
