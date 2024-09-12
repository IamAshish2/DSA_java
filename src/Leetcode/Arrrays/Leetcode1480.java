package Leetcode.Arrrays;

import java.util.Arrays;

// Running sum
public class Leetcode1480 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = runningSum(arr);
//        System.out.println(Arrays.toString(result));
        for (int ele : result) System.out.println(ele);
    }

    public static int[] runningSum(int[] nums) {
        /*
        this runs in  shit time complexity -> O(n2)
        // time complexity is real bad here : damn
        // find a better way : O(n2)
        int n = nums.length -1;
        int i=0;

        for(i=n;i>=0;i--){
            int j =0;
            while (j != i){
                    nums[i] += nums[j];
                    j++;
            }
        }
        return nums;
         */
        // more optimised solution
        // create a new output array
        int[] output = new int[nums.length];
        // check if nums is empty, if so return empty array output
        if (nums.length == 0) {
            return output;
        }

        // insert the first element in the array
        output[0] = nums[0];
        // Traverse the array while adding the values to the output starting from index 1 : left - right
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] + nums[i -1];
        }

        // return the output after traversal
        return output;
    }
}
