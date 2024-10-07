package BitwiseOperators;
// 5=101 bitmask = 010 and after set bit = 111
public class SetBitAtN {
    public static void main(String[] args) {
        System.out.println(setBit(5,1));
    }

    static int setBit(int n, int pos) {
        int bitMask = 1 << (pos); // Shift 1 by pos to get the bitmask
//        System.out.println(bitMask);
        return (bitMask | n); //Or the bitmask to set the bit at pos
    }

}
