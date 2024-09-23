package MathsForDSA;
public class MagicalNo {
    public static void main(String[] args) {
        int n=6;
        int power=5;
        int ans=0;
        while(n>0)
        {
            int d=(n&1);
           ans+=power*d;
           n=n>>1;
           power*=5;
        }
        System.out.println(ans);
    }
}
