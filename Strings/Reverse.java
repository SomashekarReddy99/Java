package Strings;
public class Reverse {
    public static void main(String[] args) {
        String name="soma";
        StringBuilder ans=new StringBuilder(name);
        ans.reverse();
        System.out.println(ans);
        String anss="";
        for(int i=name.length()-1;i>=0;i--)
        {
            anss+=name.charAt(i);
            ans.append(name.charAt(i));
        }
        System.out.println(ans.toString());
        char[] naam=name.toCharArray();
        for(int i=0;i<naam.length/2;i++)
        {
            char ch=naam[i];
            naam[i]=naam[naam.length-i-1];
            naam[naam.length-i-1]=ch;
        }
        System.out.println(new String(naam));
      
     System.out.println(anss);
    }
}
