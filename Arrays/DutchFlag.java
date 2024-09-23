package Arrays;
import java.util.*;
public class DutchFlag {
    public static void main(String[] args) {
        int[] arr={2,1,0,0,1,0,2,0,1,0};
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high)
        {
            switch(arr[mid]){
                case 0:
                      swap(arr,low,mid);
                      low++;
                      mid++;
                      break;
                    case 1:
                    mid++;
                    break;
                    case 2:
                    swap(arr,mid,high);
                    high--;
                    break;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
