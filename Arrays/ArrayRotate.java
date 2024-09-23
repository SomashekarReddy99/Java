package Arrays;
import java.util.*;
public class ArrayRotate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Rotate(2,arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Rotate(int t,int[] arr)
    {
     while(t>0)
     {
        int last=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=last;
      t--;
    }
 }
}
