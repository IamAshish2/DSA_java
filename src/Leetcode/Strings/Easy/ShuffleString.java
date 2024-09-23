package Leetcode.Strings.Easy;
/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */

public class ShuffleString {
    public static void main(String[] args) {
        int [] indices = {4,5,6,7,0,2,1,3};
        String str = "codeleet";
        System.out.println(restoreString(str,indices));
    }


    public static String restoreString(String s, int[] indices) {

        // declare a charArr with equal length to s and indices
        char [] chArr = new char[indices.length];
        int len = s.length();
        char ch;

        // loop throught the string and get each character
        for(int i=0;i<len;i++){
            ch = s.charAt(i);
            // insert at correct index by getting correct index of each letter from the indices array
            chArr[indices[i]] = ch;
        }

        // return the chArr array in String format
        return String.valueOf(chArr);
    }
}
