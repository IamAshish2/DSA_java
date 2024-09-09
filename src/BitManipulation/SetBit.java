package BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int num = 5;//0101
        int pos = 1;//0001
        int bitMask = 1 << pos; // after leftwards shift - 0010

        int newNum =  bitMask | num; // performing OR operation with num
        System.out.println(newNum); // 7
    }
}
