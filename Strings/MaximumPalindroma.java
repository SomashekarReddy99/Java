package Strings;

public class MaximumPalindroma {
        public static void main(String[] args) {
            String input = "madam arora teaches malayalam";
            int maxPalindromes = countPalindromeWords(input);
            System.out.println("Maximum number of palindrome words: " + maxPalindromes);
        }
        static int countPalindromeWords(String input)
        {
            int count=0;
            for(String n:input.split("\\s+"))
            {
               if(palindrome(n))
               {
                count++;
               }
            }
            return count;
        }
        static boolean palindrome(String str)
        {
            int s=0;
            int e=str.length()-1;
            while(s<e)
            {
                if(str.charAt(s)!=str.charAt(e))
                {
                    return false;
                }
                s++;
                e--;
            }
            return true;
        }
    }

