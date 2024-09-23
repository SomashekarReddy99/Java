package HashMap;

import java.util.HashMap;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
          HashMap<Integer,Integer> map=new HashMap<>();
          for(int i=0;i<nums.length;i++)
          {
            int com=target-nums[i];
            if(map.containsKey(com))
            {
                return new int[]{map.get(com),i};
            }
            map.put(nums[i], i);
          }
          return new int[]{-1,-1};
    }
    
    public static void main(String[] args) {
        int[] nums = {2,3,2,4,5, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);
        System.out.println("Indices: " + result[0] + " and " + result[1]);
    }
}