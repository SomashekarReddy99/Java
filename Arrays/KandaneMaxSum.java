package Arrays;

public class KandaneMaxSum {
    public static void main(String[] args) {
        int[] arr={3,4,5,-20,1,6,7,8};
        System.out.println(Maxsum(arr));
    }
    static int Maxsum(int[] arr)
    {
      int curmax=Integer.MIN_VALUE;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
      {
        curmax=Math.max(arr[i],curmax+arr[i]);
        max=Math.max(max,curmax);
      }
      return max;
      
    }
}
