package Recursion.RecursionBeginner;

//Write a Java recursive method to check if a given array is sorted in ascending order.
public class isArraySorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,44,5};
        System.out.println(isSorted(arr,0));
    }

    static boolean isSorted(int [] arr,int idx){
        if(idx == arr.length -1){
            return true;
        }

        if(arr[idx] > arr[idx +1]){
            return false;
        }
        return isSorted(arr,idx+1);
    }
}
