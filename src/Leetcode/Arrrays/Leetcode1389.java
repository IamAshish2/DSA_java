package Leetcode.Arrrays;

import java.util.ArrayList;
import java.util.Arrays;

/* 1389. Create Target Array in the Given Order

Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

Example 2:

Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]
 */
public class Leetcode1389 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,0};
        int [] index = {0,1,2,3,0};
        int [] result = createTargetArray(nums,index);
        System.out.println(Arrays.toString(result));
    }
/*
     //approach runs at 1ms runtime speed i.e not that bad but this solution can use some good 0ms solution

    public static int[] createTargetArray(int[] nums, int[] index) {
        // define a target array with the length equal to nums arr
        int [] targetArray = new int[nums.length];
        int length  = targetArray.length;

        // fill the target Array with -1 and remove 0 from the array i.e. the initial value so we can take
        // 0 into consideration as 0 is a index and if we have to move 0 number to 0 index ,we can do it easily
        for(int i=0;i<length;i++){
            targetArray[i] = -1;
        }

        // iterate throught the array
        for(int i=0;i<nums.length;i++){
            // determine the index to insert value
            int idx = index[i];

            // check if there is any value in the array or not
            // if not then insert the value directly
            if(targetArray[idx] == -1){
                targetArray[index[i]] = nums[i];
            }else{ // else move the items to the right and then put the value in the targetArray
                // move values to the right
                for(int j=length-1;j>idx;j--){
                    targetArray[j] = targetArray[j-1];
                }
                targetArray[index[i]] = nums[i];
            }

        }
        return targetArray;
    }

 */

    // this approach is much better and runs at 0ms runtime speed with O(n2) time complexity
    static int[] createTargetArray(int [] nums,int [] index){
        ArrayList<Integer> arrNums = new ArrayList<>();
        int len = nums.length;

        // insert values  i of nums array at index j of index array
        for (int i=0;i<len;i++){
            arrNums.add(index[i],nums[i]);
        }

        int [] result = new int[len];
        // insert into result array from the arraylist
        for (int i=0;i<len;i++){
            result[i] = arrNums.get(i);
        }

        // return the result
        return result;
    }
}
