package Strings;

public class MinimumStringWindow {
    public static void main(String[] args) {
        System.out.println(minWindow("ATSHBSKABANC","ABC"));
    }
    static String minWindow(String s,String t)
    {
        String ans="";
        if(t.length()>s.length())
        {
            return "";
        }
        int[] tcount=new int[128];
        for(char ch:t.toCharArray())
        {
            tcount[ch]++;
        }
        char[] schar=s.toCharArray();
        int left=0;
        int right=0;
        int found=0;
        int toFind=t.length();
        int minwindow=Integer.MAX_VALUE;
        while(right<s.length()){
           char ch=schar[right];
           tcount[ch]--;
           if (tcount[ch] >= 0) {
            found++;
        }
           while(found==toFind)
           {
             if(minwindow>(right-left+1))
            {
                minwindow=right-left+1;
                ans=s.substring(left,right+1);
            }
                  tcount[schar[left]]++;
                  if(tcount[schar[left]]>0)
                {
                  found--;
                }
                left++;
           }
           right++;
         }
         return ans;
    }
}
