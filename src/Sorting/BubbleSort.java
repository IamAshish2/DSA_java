package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {100,20,30,433,55};
//        int [] arr = {1,2,3,4,5}; // buble sort for already sorted elements
        bubbleSort(arr);
        for(int num : arr){
            System.out.println(num);
        }
    }

    static void bubbleSort(int[] arr){
        int len = arr.length;
        boolean swapped;
        //bubble sort but better // ascending description
        // we are going till len-1 because when i = len -1, the array will be sorted already,i.e.  when i is in it's n-1th
        // iteration, j - 1 > j : the second value and first will be sorted
        for (int i=0;i<len-1;i++){ //
            swapped = false;
            // len - i makes it so that we do not have to compare the values that are already sorted in the right side again and again
            // for each step, the max item will come at last respective index, so no need to compare the sorted/max part
            for (int j=1;j<len-i;j++){ // j<len-i == j<=len-i-1
                if(arr[j] < arr[j-1]){ // replace > for descending order
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i,then we know the array is sorted,we can break out of the loops and end
            // the swapping process
            if(!swapped){
                return; // or use break statement
            }

        }
    }
        /* This was making comparisions for the values which were already sorted at last indexes
        for(int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
         */
}
