package Recursion.RecursionIntermediate;
//Check if an array is sorted (strictly increasing)
public class ArrayIsSorted {

    public static void main(String[] args) {
        int [] arr = {1,3,5};
        System.out.println(isSorted(arr,0));
    }

    // O(n) time complexity
   static boolean isSorted(int [] arr,int idx){
        // base case reached i.e. we traversed the arr
       if(idx == arr.length - 1){
           return true;
       }
       // checking with <
       /*
        if(arr[idx] < arr[idx+1]) {
           return isSorted(arr,idx+1); // recursively returns the boolean value of every function call
        }else{
            return  false;
        }

        */

        // checking with >
       if(arr[idx] >= arr[idx +1]){
           return  false;
       }
       return  isSorted(arr,idx+1);
    }
}
