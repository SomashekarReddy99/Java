package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String name="Madaim";
        System.out.println(check(name));
    }
    static boolean check(String name)
    {
        String ans=name.toLowerCase();
        for(int i=0;i<ans.length()/2;i++)
        {
            if(ans.charAt(i)!=ans.charAt(ans.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
}
