package HashMap;


import java.util.*; 
public class Example {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"soma");
        map.put(4,"rama");
        map.put(3,"shyam");
        map.put(2,"Arjuna");
        for(Map.Entry<Integer,String> m:map.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
           }  
           System.out.println(map.keySet());
           System.out.println(map.values());
           System.out.println(map.getOrDefault(1, null));
           System.out.println(map.containsKey(1));
           System.out.println(map.containsValue("rama"));
           System.out.println(map.remove(5));
           System.out.println(map.replace(2,"raghu"));
           System.out.println(map.get(2));
    }
}
