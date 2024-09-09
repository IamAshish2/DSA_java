package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {100,20,30,433,55};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){// comparing to the value of the min element
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int ele : arr) System.out.println(ele);
    }
}
