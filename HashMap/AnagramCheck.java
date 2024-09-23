package HashMap;

import java.util.HashMap;

public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
      for(char ch:s1.toCharArray())
      {
        map.put(ch,map.getOrDefault(ch, 0)+1);
      }
        for(char c:s2.toCharArray())
        {
            if(!map.containsKey(c))
            {
                return false;
            }
            map.put(c,map.getOrDefault(c, 0)-1);
            if(map.get(c)==0)
            {
             map.remove(c);
            }
        }
        return map.isEmpty();
    }
    
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silenst";
        System.out.println("Are they anagrams? " + isAnagram(s1, s2));
    }
}
