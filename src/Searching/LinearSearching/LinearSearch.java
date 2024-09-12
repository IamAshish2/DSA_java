package Searching.LinearSearching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {44,293,553,98,23};
        int item = 23;
        System.out.println(searchLinear(arr,0,item));
        System.out.println(isFound(arr,item));
    }

    //0(n) time complexity for searching an item as we have to traverse the whole array at a worst case senario
    // recursive linear serach function
    static int searchLinear(int [] arr,int idx,int item){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == item ){
            return idx;
        }

        return searchLinear(arr,idx+1,item);
    }

    // search for item in the array
    static boolean isFound(int [] arr,int item){
        // edge case
        if(arr.length == 0){
            return false;
        }
        // declare a found variable to indicate if an item is found
        boolean found = false;
        // run a for loop
        for (int j : arr) {
            // if  j matches the item, declare it found and break from the loop
            if (j == item) {
                found = true;
                break;
            }
        }
        // return truthy/falsy value based on result above
        return found;
    }
}
