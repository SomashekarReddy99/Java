package Arrays;

public class count1s {
    public static void main(String[] args) {
        int[] arr={4,2,1,1,1,1,1,4,1,1,1,1,1,1,1,1,1};
        System.out.println(maxOne(arr));
    }
    static int maxOne(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==1)
          {
            count++;
            max=Math.max(max,count); 
          }
          else{
           count=0;
          }
        }

        return max;
    }
}
