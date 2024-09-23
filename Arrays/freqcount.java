package Arrays;

import java.util.*;

public class freqcount {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,2,1,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr)
        {
            if(map.containsKey(n))
            {
             map.put(n,map.get(n)+1)  ;
            }else{
            map.put(n,1);
            }
        }
        System.out.println(map);
        // int maxElement = Arrays.stream(arr).max().getAsInt();
        int[] temp=new int[arr.length-1];
        for(int i=0;i<arr.length;i++)
        {
                 temp[arr[i]]++;
        }
        System.out.println(Arrays.toString(temp));
    }
}
