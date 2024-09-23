package Arrays;

public class LeastSquareSum {
    public static void main(String[] args) {
        int n=10;
        boolean found=false;
        for(int a=1;a*a<=n/2;a++)
        {
            int bsquare=n-a*a;
            int b=(int)Math.sqrt(bsquare);
            if(b*b==bsquare)
            {
                found=true;
                System.out.println(a+" "+b);
                break;
            }            
        }
        if(!found)
        {
            System.out.println("no combination");
        }
    }
}
