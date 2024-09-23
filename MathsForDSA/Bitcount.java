package MathsForDSA;

public class Bitcount {
    public static void main(String[] args) {
        int num = 10;  // Example number (Binary: 11101)
        int setBits = 0;
        int unsetBits = 0;
        int totalBits = Integer.toBinaryString(num).length();  // 32 bits for int type

        for (int i = 0; i < totalBits; i++) {
           if((num & (1<<i))!=0)
           {
             setBits++;
           }
           else{
            unsetBits++;
           }
        }

        System.out.println("Number of set bits: " + setBits);
        System.out.println("Number of unset bits: " + unsetBits);
    }
}