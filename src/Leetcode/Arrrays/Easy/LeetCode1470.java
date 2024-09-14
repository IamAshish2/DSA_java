package Leetcode.Arrrays.Easy;
/* 1470. Shuffle the Array


Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
import java.util.Arrays;

public class LeetCode1470 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] result = shuffle(nums, 3);
        System.out.println(Arrays.toString(result));
    }

//    public static int[] shuffle(int[] nums, int n) {
//      int [] ans = new int[n*2];
//      int i = 0; // keep track of left side of the nums array
//        int j = n; // keep track of right side of nums array // n is half of the array
//        int k = 0; // inserting value index of ans array
//
//        //{2, 5, 1, 3, 4, 7};
//        while (j < nums.length){
//            // first add the from the first half and increment it's index i.e {2,3,1}
//            ans[k] = nums[i];
//            i++;
//            k++;
//
//            // insert values from the second half of the array nums
//            // i.e.{3,4,7}
//            ans[k] = nums[j];
//            j++;
//            k++;
//        }
//        return  ans;
//    }

    // less code
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        // Interleave elements from both halves
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        return result;
    }

}
