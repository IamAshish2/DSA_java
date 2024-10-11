package Maths.BitwiseOperators;

public class GetBitAtN {
    public static void main(String[] args) {
        System.out.println(getBit(5,2));
    }

    static int getBit(int n, int pos){
       /* int bitMask = 1 << pos;
        return (bitMask & n) == 0 ? 0 : 1;
        System.out.println(n & 1 << pos);
        */
        return (n & (1 << pos)) == 0 ? 0 : 1;
    }
}
