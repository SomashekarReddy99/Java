package Strings;

import java.util.Arrays;


public class importConversion {
    public static void main(String[] args) {
        String num="10";
        int no=Integer.parseInt(num);
        System.out.println(no);
        String numm=Integer.toString(no);
        System.out.println(numm);
        String bno=Integer.toBinaryString(no);
        System.out.println(bno);
        String Hno=Integer.toHexString(no);
        System.out.println(Hno);
        String Ono=Integer.toOctalString(no);
        System.out.println(Ono);

        char[] arr=num.toCharArray();
         System.out.println(Arrays.toString(arr));

         char ch='a';
         int chno='a'+'0';
        System.out.println(ch+" "+chno);
    }
}
