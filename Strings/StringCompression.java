package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String input="aaaacc";
        String ans=Compress(input);
        System.out.println(ans);
    }
    static String Compress(String input)
    {
        char[] arr=input.toCharArray();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<arr.length)
        {
            int count=0;
            char ch=arr[i];
            while (i < arr.length && arr[i] == ch) {
                count++;
                i++;
            }
            sb.append(ch);
            String n=Integer.toString(count)+"";
            int no=Integer.parseInt(n);
            sb.append(no);
        }
        return sb.toString();
    }
}
