package HashMap;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0, 1);
        // int count = 0, sum = 0;
        
        // for (int num : nums) {
        //     sum += num;
        //     System.out.println(sum);
        //     if (map.containsKey(sum - k)) {
        //         System.out.println("*"+(sum-k));
        //         count += map.get(sum - k);
        //         System.out.println(map.get(sum - k));
        //     }
        //     map.put(sum, map.getOrDefault(sum, 0) + 1);
        // }
        HashMap<Integer,Integer> map=new HashMap<>();
         map.put(0,1);
         int count=0;
         int sum=0;
         for(int N:nums)
         {
            sum+=N;
            System.out.println(map.get(sum-k));
            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
         }
        return count;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,1,1,3};
        int k = 3;
        System.out.println("Number of subarrays with sum = " + k + ": " + subarraySum(nums, k));
    }
}

