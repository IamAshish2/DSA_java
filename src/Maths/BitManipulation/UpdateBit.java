package Maths.BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Choose the bit to update to: ");
        System.out.println("0 | 1");
        int input = sc.nextInt();
        System.out.println("Choose the position to update: ");
        int pos = sc.nextInt();

        int n = 5;
//        int pos = 1;
        if(input == 1){ // update bit to 1
            int bitMask = 1 << pos;
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else{ // update bit to 0
            int bitMask = 1 << pos;
            int negateBitMask = ~(bitMask);
            int newNumber = negateBitMask & n;
            System.out.println(newNumber);
        }
    }
}
