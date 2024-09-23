package Arrays;

import java.util.Arrays;

public class KandaneSubArray {
    public static void main(String[] args) {
        int[] arr={-4,2,1,60,-2,-3};
        System.out.print(Arrays.toString(maxArr(arr)));
    }
    static int[] maxArr(int[] arr)
    {
        int start=0;
        int end=0;
        int cstart=0;
        int curmax=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            curmax+=arr[i];
            if(max<curmax)
            {
                max=curmax;
                start=cstart;
                end=i;
            }
            if(curmax<0)
            {
                curmax=0;
            
                cstart=i+1;
            }
        }
        int tem[]=new int[end-start+1];
        int pos=0;
        for(int i=start;i<=end;i++)
        {
          tem[pos++]=arr[i];
        }
        return tem;
    }
}
