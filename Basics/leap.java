

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println(ch);

        int num=sc.nextInt();
        if(leapyear(num))
        {
            System.out.println("it is leap");
        }
        else{
            System.out.println("not leap");
        }
        sc.close();
    }
    static boolean leapyear(int num)
    {
        if(num%4==0)
        {
            if(num%100==0)
            {
                return num%400==0;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
