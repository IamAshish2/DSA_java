package Recursion.RecursionIntermediate;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse: ");
        String str = sc.nextLine();
        reverseString(str,str.length()-1);
    }

    // time complexity => O(n) where n is the length of the string
    static void reverseString(String str,int index){
        if(index == 0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str,index-1);
    }
}
