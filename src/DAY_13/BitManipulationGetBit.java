package DAY_13;

public class BitManipulationGetBit {
    public static void main(String[] args) {
        int n = 5;
        int i = 3;
        int bitMask = 1<<i;

        if ((bitMask & n) == 0){
            System.out.println("Bit is Zero");
        }else {
            System.out.println("Bit is one");
        }
    }
}
