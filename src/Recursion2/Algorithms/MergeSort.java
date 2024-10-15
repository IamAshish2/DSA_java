package Recursion2.Algorithms;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {8,3,4,12,5,6};
        int [] sorted = mergeSort(arr);
        System.out.println(Arrays.toString(sorted));
    }

    static int[] mergeSort(int [] arr){
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int [] first = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] second = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);
    }

    static int [] merge(int [] left, int [] right){
        int [] mergedArr = new int[left.length + right.length];
        // pointers for left,right and mergedArr array
        int i = 0;
        int j = 0;
        int k = 0;

        // merge the left and right array
        while (i < left.length  && j < right.length){
            if (left[i] < right[j]){
                mergedArr[k] = left[i];
                i++;
            }else{
                mergedArr[k] = right[j];
                j++;
            }
            k++;
        }

        // check for the possibility of remaining elements of left or right array
        // reason: i < left.length || j < right.length -> while checking there is a possibility
        // that one of the arrays was checked fully while other was not
        while (i < left.length){
            mergedArr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length){
            mergedArr[k] = right[j];
            j++;
            k++;
        }

        return  mergedArr;
    }
}
