package Leetcode.Arrrays.Easy;

/* 1732. Find the Highest Altitude
There is a biker going on a road trip.
The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the ne
t gain in altitude between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 */
public class Leetcode1732 {
    public static void main(String[] args) {
        int [] gain = {52,-91,72};
        System.out.println(largestAltitude(gain));
    }

    public static  int largestAltitude(int[] gain) {
        int minAltitude = 0;
        int sum = 0;
        for(int i=0;i<gain.length;i++){
            sum = sum + gain[i];
            minAltitude = Math.max(sum,minAltitude);
        }
        return minAltitude;
    }
}