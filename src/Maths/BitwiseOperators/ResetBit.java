package BitwiseOperators;

public class ResetBit {
    public static void main(String[] args) {
        System.out.println(resetBit(5,0));
    }

    static int resetBit(int n , int pos){
        int bitMask = ~(1 << pos); // think in terms of 1 :  1 in binary => 00001
        return bitMask & n;
    }
}
