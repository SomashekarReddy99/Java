package Strings;

public class LongestPalindrome {
    public static void main(String[] args) {
        String input="afgabbads";
        System.out.println(Palindrome(input));
    }
    static String Palindrome(String input)
    {
        if(input==null)
        {
            return "";
        }
        int start=0;
        int end=0;
        for(int i=0;i<input.length();i++)
        {
            int len1=expandAtCenter(input,i,i);
            int len2=expandAtCenter(input,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start)
            {
                start=i-(len-1)/2;
                end=i+(len)/2;
            }
        }
        return input.substring(start, end+1);
    }
    static int expandAtCenter(String input,int l,int r)
    {
        while(l>=0 && r<input.length()  && input.charAt(l)==input.charAt(r))
        {
            l--;
            r++;
        }
        return r-l-1;
    }
}
