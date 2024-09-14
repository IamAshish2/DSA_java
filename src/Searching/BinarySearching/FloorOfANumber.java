package Searching.BinarySearching;

public class FloorOfANumber {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int index = floorOfNumber(arr,target);
        System.out.println("The floor of " + target + " in the array is " + arr[index] );
    }

    // return the greatest number  <= target
    static int floorOfNumber(int [] arr, int target){
        // initialize start and end
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // we donot do (start + end) /2 just to be safe that adding start and end doesnot cause overflow if sum > the max value
            // an integer can hold in java
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
        // when the while loop ends, the end value will be equal to the last remaining value's index
        // if we did not find an  element with same value as target in the array the element then
        // we simply return the greatest number smaller or = target I.E. end
        return end;
    }
}
