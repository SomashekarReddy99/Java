package MathsForDSA;

public class SetorUnset {
    public static void main(String[] args) {
        int num = 5;  
        int pos=2;
        num =num & ~(1<<pos);
        
        System.out.println("After setting bit: " + num);
    }
}
