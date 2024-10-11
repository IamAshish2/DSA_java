package Maths.BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = ~(1 << pos); // negating to replace 1 with 0

        int newNumber = bitMask & n; // performing AND operation with the num to get new number
        System.out.println(newNumber);
    }
}
