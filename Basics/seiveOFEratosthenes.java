/**
 * seiveOFEratosthenes
 */
public class seiveOFEratosthenes {

    public static void main(String[] args) {
        int n=10;
        seive(n);
    }
    static void seive(int n)
    {
        boolean[] prime=new boolean[n+1];
        for(int i=0;i<=n;i++)
        {
            prime[i]=true;
        }
         for(int p=2;p*p<=n;p++)
         {
            if(prime[p]==true)
            {
                for(int i=p*p;i<=n;i++)
                {
                    prime[i]=false;
                }
            }
         }
         for (int p = 2; p <= n; p++) {
            if (prime[p] == true) {
                System.out.print(p + " ");
            }
         }
    }
}