// package Strings;

import java.util.ArrayList;
import java.util.List;

public class Expression {
    public static void main(String[] args) {
        String input = "-1/2-1/2+1/3";
        System.out.println("Result: " + fractionAddition(input));
    }
    static String fractionAddition(String input)
    {
      List<String> terms=new ArrayList<>();
      input=input.replace("-","+-");

      String[] part=input.split("\\+");

         for (String parts : part) {
            if (!parts.isEmpty()) {
                terms.add(parts);
            }
        }

      int numerator=0;
      int denominator=1;
      for(String fraction:terms)
      {
        String[] frac=fraction.split("/");
        int num=Integer.parseInt(frac[0]);
        int den=Integer.parseInt(frac[1]);
      int lcm=(denominator*den)/gcd(denominator,den);
      numerator=(numerator*(lcm/denominator))+(num*(lcm/den));
      denominator=lcm;
      }
      int gcdfinal=gcd(Math.abs(numerator),denominator);
      numerator/=gcdfinal;
      denominator/=gcdfinal;

      return numerator+"/"+denominator;
      
    }

    private static int gcd(int a,int b) 
      {
      
        return (b!=0)?gcd(b,a%b):a;
    }
}
