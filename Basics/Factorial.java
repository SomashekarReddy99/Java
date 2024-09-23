public class Factorial {
    public static void main(String[] args) {
        int n=7;
        int ans=1;
        for(int i=7;i>=1;i--)
        {
            ans*=i;
        }

        System.out.println(ans+" "+factorial(n));
    }
    static int factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return factorial(n-1)*n;
    }
}
