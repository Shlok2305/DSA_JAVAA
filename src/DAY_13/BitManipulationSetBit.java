package DAY_13;

public class BitManipulationSetBit {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int bitMask = 1<<i;

        int newno = bitMask | n;
        System.out.println(newno);

    }
}
