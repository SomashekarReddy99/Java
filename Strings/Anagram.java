package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String w="silent";
        String x="listen";
        System.out.println(check(w,x));
    }
    static boolean check(String w,String x)
    {
        char[] y=w.toCharArray();
        char[] z=x.toCharArray();
        Arrays.sort(y);
        Arrays.sort(z);
        if(y.length!=z.length)
        {
            return false;
        }
        int l=Math.min(y.length,z.length);
        for(int i=0;i<l;i++)
        {
            if(y[i]!=z[i])
            {
                return false;
            }
        }
        return true;

    }
}
