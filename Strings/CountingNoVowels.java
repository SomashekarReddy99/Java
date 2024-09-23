package Strings;

public class CountingNoVowels {
    public static void main(String[] args) {
        String input="aeIou";
        System.out.println(count(input));
    }
    static int count(String input)
    {
        char[] arr=input.toCharArray();
        int count=0;
        String vowel="aeiouAEIOU";
        for(int i=0;i<arr.length;i++)
        {
            if(vowel.contains(arr[i]+""))
            {
              count++;
            }
        }
        return count;
    }
}
