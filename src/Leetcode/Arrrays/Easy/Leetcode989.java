package Leetcode.Arrrays.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class Leetcode989 {
    public static void main(String[] args) {
//        int [] arr = {9,9,9,9,9,9,9,9,9,9};
        int [] arr = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(arr,k));

    }

    public static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        int n = num.length;
        int i = n - 1;
        int carry = k;

        // Start from the least significant digit and add k
        while (i >= 0 || carry > 0) {
            if (i >= 0) {
                carry += num[i];
                i--;
            }
            nums.add(carry % 10);
            carry /= 10;  // Move the carry to the next digit
        }

        // Since we added digits from least significant to most significant, reverse the list
        Collections.reverse(nums);
        return nums;
    }
}
