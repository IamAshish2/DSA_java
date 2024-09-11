package Recursion.RecursionBeginner;
//Write a Java recursive method to find the maximum element in an array.
public class MaxInArr {

    public static void main(String[] args) {
//        int [] arr = {1,2,3,42,34,322,999};
        int[] arr = {
                34,
                45,
                34,
                23,
                56,
                62,
                27,
                55
        };

        System.out.println(findMax(arr,0,arr.length -1 ));
    }

    static int findMax(int [] arr,int left,int right){
        // base case i.e. the left and right indexes are at the same point
        if(left == right){
            return arr[left];
        }

        //calculate mid value at every iteration
        // recursive case: calculate the half on every iteration while calculating the maximum element in both halves
        // and return the greatest element
        int mid = (left + right) / 2;
        int maxLeft = findMax(arr,left, mid);
        int maxRight = findMax(arr,mid +1,right);

        return Math.max(maxLeft,maxRight);
    }
}
