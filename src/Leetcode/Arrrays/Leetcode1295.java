package Leetcode.Arrrays;
/* 1295. Find Numbers with Even Number of Digits
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
 */
public class Leetcode1295 {
    public static void main(String[] args) {
        System.out.println("The no of digits with even number of digits are: " + findNumbers(new int [] {0,9437,315,322,431,686,264,442}));
    }

    static int findNumbers(int [] nums){
        int evenNumCounter = 0;

        // time complexity O(n2) : we have to iterate the array twice fully
        for (int ele : nums) {
            // checking if even digits exists or not
            if (isEvenDigits2(ele) % 2 == 0) {
                evenNumCounter++;
            }
        }
        return  evenNumCounter;
        // keeping this code minimal and understandable by creating a new function to check if the digits contains even number
        // of digits ::: this was a while loop inside the for loop
            /*
            int counter = 0;
            while (ele != 0){
                counter++;
                ele /= 10;
            }

            if(counter % 2 == 0){
                evenNumCounter++;
            }
            counter = 0;
             */
    }

    static boolean isEvenDigits(int num){
        // checking some edge cases
        if(num < 0) num = num * -1;

        if(num == 0){
            return false;
        }

        int counter = 0;
        while (num != 0){
            counter++;
            num /= 10;
        }
        if(counter % 2 == 0){
            return true;
        }
        return false;
    }

    // this method is 1ms faster than the other method
    static int isEvenDigits2(int num){

        if(num < 0) num = num * -1;

        if(num == 0){
            return -1;
        }

        return (int)(Math.log10(num) + 1); // shortcut method to find the number of digits of a number
    }
}
