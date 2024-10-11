package Recursion2.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,56,88,90,101};
        int [] arr2 = {1,2,4,3,5,6};
        int p = 0;
        boolean isSorted = isArraySorted(arr2,p);
        System.out.println(isSorted);
    }

    // isArraySorted method takes two arguments arr array and p pointer that starts from 0
    static boolean isArraySorted(int [] arr,int p){
        // if pointer p starting from index 0 reaches arr.length -1 , meaning we are at the last of the arr and now
        // we are safe to say the array is sorted
        if(p == arr.length  -1 ){
            return true;
        }

        /* this and the below return statement do the same thing

        // keep calling the recursive method incrementing till element at index p is less than element at p + 1
        if(arr[p] < arr[p+1]){
            return isArraySorted(arr,p+1);
        }
        // else just return false because if element at p > element at p + 1, we know it is not sorted ascending,
        // so just return false
        return false;
         */
        return arr[p] < arr[p+1] && isArraySorted(arr,p+1);
    }
}
