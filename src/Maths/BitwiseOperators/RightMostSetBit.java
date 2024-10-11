package Maths.BitwiseOperators;
// find the position of rightmost set bit
public class RightMostSetBit {
    public static void main(String[] args) {
        findRightMostSetBit(182);
        System.out.println();
    }

    private static void findRightMostSetBit(int num) {
        int bitMask = num >> 1;
        System.out.println(bitMask);
    }


    private static int getBit(int num,int pos){
        int bitMask = 1 << pos;
        return (num & bitMask) == 0 ? 0 : 1;
    }

}
