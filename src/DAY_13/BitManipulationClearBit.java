package DAY_13;

public class BitManipulationClearBit {
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        int bitMask = 1<<i;
        int notBitMask = ~(bitMask);

        int newno = notBitMask & n;
        System.out.println(newno);
    }
}
