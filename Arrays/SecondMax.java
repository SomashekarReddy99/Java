package Arrays;

/**
 * SecondMax
 */
public class SecondMax {

    public static void main(String[] args) {
        int[] arr={5,3,1,5,65,432,1,33,99};
        int smax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
            }
            if(arr[i]>smax && arr[i]!=max)
            {
                smax=arr[i];
            }
        }
        System.out.println(max+" "+smax);
    }
}