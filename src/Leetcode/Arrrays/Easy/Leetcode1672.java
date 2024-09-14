package Leetcode.Arrrays.Easy;

/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
 Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
 */
public class Leetcode1672 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }

    //  get the richest person's money
    public  static  int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int [] person: accounts){
            int sum = 0;
            for(int account : person){
                sum += account;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }

//    public int maximumWealth(int [][] accounts){
//        int ans = Integer.MIN_VALUE;
//        for(int person = 0; person<accounts.length;person++){
//            // when we start a new column take a new sum for that row
//            int sum = 0;
//            for (int account =0; account < accounts[person].length;account++){
//                sum += accounts[person][account];
//            }
//
//            // when you are outside the loop , we now have sum of accounts of persons
//            // check with overall ans
//            if (sum > ans){
//                ans = sum;
//            }
//        }
//        return  ans;
//    }
}
