package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyInArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3,4,4,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        } 
        System.out.println(map);
        int[] temp=new int[map.size()+1];
        for(int i=0;i<4;i++)
        {
            temp[i]=map.getOrDefault(i, 0);
        }
        System.out.println(Arrays.toString(temp));
    }
}
