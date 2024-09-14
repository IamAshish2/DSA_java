package Searching.BinarySearching;
// find the ceiling of a number :
// assume the array is sorted
// a ceiling number is such a number which is >= the target num.
// i have applied binary search to return the index of ceiling of a number
public class CeilingOfANumber {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 19;

        System.out.println("The index of " + target + " in the array is " +  ceilingOfNumber(arr,target));
    }
    // return the smallest value >= target
    static int ceilingOfNumber(int [] arr, int target){
        // what if there is no value that is greater than or equal to the array
        if (target > arr[arr.length -1]) return -1;

        // initialize start and end
        int start = 0;
        int end = arr.length - 1;

        /*
        // initialize the ceiling to be a dummy value i.e. -1 in my case
        // we do not have to actually use a new variable
        // int ceiling = -1;

        // loop through the array
        while (start <= end){
            // in every iteration, divide your arr in half and get the middle value
            int mid = start + (end - start) / 2;

            // check if the value at mid is equal to our target, if so, then we have found the ceiling of the number
            // we simply return it from here
            if(arr[mid] == target){
                ceiling = mid;
                return  ceiling;
            }

            // check if the value at mid is greater than or smaller than the target
            // then simply move either the start or end index and  cut your array in half
            if(arr[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            // perform a vitality check, i.e. a celing of a number can only be  greaterthan or equal to(>=) our target element
           if (arr[mid] >= target){
               ceiling = mid;
           }
        }
        // simply return the ceiling of our number
        return  ceiling;
         */
        while (start <= end){
            // we donot do (start + end) /2 just to be safe that adding start and end doesnot cause overflow
            // if sum > the max value an integer can hold in java
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return  mid; // found the ceiling of the number i.e. element with same value as target is found in the array
            }

            if (target < arr[mid]){
                end = mid -1; // move the end pointer to the left
            }else{
                start = mid + 1; // move the start pointer to the right
            }
        }
        // when the while loop ends, the start value will be (start = end + 1)
        // if we did not find an  element with same value as target in the array the element which is closely >
        // the target is the ceiling, so return start
        return start;
    }
}
