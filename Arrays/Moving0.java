package Arrays;
import java.util.*;
public class Moving0 {
    public static void main(String[] args) {
        int[] arr={0,0,1,0,7,0,3,0,3,0,2,2};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void move(int[] arr)
    {
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
              if(arr[j]!=0)
              {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
              }
        }
    }
}
