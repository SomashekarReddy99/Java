package HashMap;

import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> map=new HashMap<>();
    for(String s:strs)
    {
      char[] schar=s.toCharArray();
      Arrays.sort(schar);
      String ss=new String(schar);
      map.computeIfAbsent(ss,f->new ArrayList<>()).add(s);
    }
    return new ArrayList<>(map.values());
    }
    
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Grouped anagrams: " + groupAnagrams(strs));
    }
}

