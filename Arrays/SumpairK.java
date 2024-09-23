package Arrays;

import java.util.*;

public class SumpairK {
    public static void main(String[] args) {
        int[] arr={2,1,5,3,4,3,8,9};
        int k=6;
        List<int[]> ans=Findpair(arr,k);
         for(int[] n:ans)
         {
           System.out.print(Arrays.toString(n));
         }
    }
    static List<int[]> Findpair(int[] arr,int k)
    {
        List<int[]> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<arr.length;i++)
        { 
            int c=k-arr[i];
            if(map.containsKey(c))
            {
                res.add(new int[]{arr[i],c});
            }
          map.put(arr[i],i);
            // for(int j=i+1;j<arr.length;j++)
            // {
            //     if(arr[i]+arr[j]==k)
            //     {
            //         res.add(new int[]{arr[i],arr[j]});
            //     }
            // }
        }
        System.out.println(map);
        return res;
    }
}
