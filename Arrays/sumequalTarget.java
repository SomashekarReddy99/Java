package Arrays;

import java.util.*;
public class sumequalTarget {
    public static void main(String[] args) {
        int[] arr={10,1,1,3,4,5,8,1,1,1,9};
        int target=12;
        System.out.println(Arrays.toString(sum(arr,target)));
    }
    static int[] sum(int[] arr,int target)
    {
       int start=0;
       int end=0;
       int sum=0;
       int length=0;
        for(int i=0;i<arr.length;i++)
       {
              sum+=arr[i];
              if(sum==target)
              {
                end=i;
              }
              if(sum<0)
              {
                sum=0;
                start=i+1;
              }
              length=Math.max(end-start+1,length);
              
       }
       return new int[]{start,end,length};
    }
}
