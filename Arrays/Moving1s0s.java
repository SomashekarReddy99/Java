
package Arrays;
import java.util.*;

public class Moving1s0s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 3, 7, 0, 1, 7, 0, 1, 0, 7, 1, 0, 0};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void move(int[] arr) {
       int i=0;
       int j=0;
       int k=arr.length-1;
       while(j<=k)
       {
         if(arr[j]==1)
         {
            swap(arr,i,j);
            i++;
            j++;
         }
         else if(arr[j]==0)
         {
            swap(arr,j,k);
            j++;
            k--;
         }
         else{
            j++;
         }
       }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
