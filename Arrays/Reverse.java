package Arrays;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
          int temp=arr[i];
          arr[i]=arr[n-i-1];
          arr[n-i-1]=temp;
        }
    }
}
