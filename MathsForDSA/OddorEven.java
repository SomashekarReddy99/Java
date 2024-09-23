/**
 * OddorEven
 */
package MathsForDSA;
public class OddorEven {

    public static void main(String[] args) {
        int a=1999999998;
        if((a&1)==0)
        {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        int b=10&3;
        System.out.println(b);
    }
}