package Strings;
import java.util.Arrays;
public class CommonPrefix {
    public static void main(String[] args) {
        String[] word={"flower","flow","floght"};
        Arrays.sort(word);
        String str1=word[0];
        String str2=word[word.length-1];
        int l=Math.min(str1.length(),str2.length());
        int end=0;
        for(int i=0;i<l;i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                break;
            }
            end++;
        }
        System.out.println(end);
        System.out.println(str1.substring(0, end));

    }
}
