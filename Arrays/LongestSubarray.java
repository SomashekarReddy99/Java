package Arrays;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {10,5,-10,5,10,10,10};
        int k = 10;
        int sum = 0;
        int maxlen = 0;
        int j = 0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>k && j<=i)
            {
               sum-=arr[j];
               j++;                
            }
            if(sum==k)
            {
                maxlen=Math.max(maxlen,i-j+1);
            }
        }
      
        System.out.println("Length of the longest subarray with sum " + k + ": " + maxlen);
    }
}
