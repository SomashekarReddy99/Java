package Strings;

public class Characterno {
    public static void main(String[] args) {
        String name="ABCD";
        int ans=ConvertNo(name);
        System.out.println(ans);
    }
    static int ConvertNo(String name)
    {
        char[] arr=name.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char ch:arr)
        {
            int chno=ch-'A'+1;
            sb.append(chno);
        }
        String ans=new String(sb);
        return Integer.parseInt(ans);
    }
   

}
