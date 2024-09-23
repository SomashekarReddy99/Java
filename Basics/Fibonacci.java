public class Fibonacci {
   public static void main(String[] args) {
    int n=10;
    int num1=0;
    int num2=1;
    System.out.println(fibonacci(n));
    for(int i=0;i<n;i++)
    {
        System.out.print(num1+" ");
       int num=num1+num2;
        num1=num2;
        num2=num;
    }
   } 
   static int fibonacci(int n)
   {
          if(n<=1)
          {
            return n;
          }
          return fibonacci(n-1)+fibonacci(n-2);
   }
}
