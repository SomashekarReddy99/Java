package Arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr={7,-1,-2,3,8,4};
        int profit=0;
        int sell=0;
        int buy=Integer.MAX_VALUE;
        for(int n:arr)
        {
            if(n<buy)
            {
                buy=n;
            }
            if(n-buy>profit)
            {
               sell=n;
                profit=n-buy;
            }
        }
        System.out.println(buy+" "+sell+" "+profit);
    }
}
