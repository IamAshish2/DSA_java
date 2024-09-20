package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {100,20,30,433,55};

        selectionSort(arr);
        for(int ele : arr) System.out.println(ele);
    }


    // ascending order
    static void selectionSort(int [] arr){
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            int start = len - 1 ;
            int min = findMin(arr,start,i);
            swap(arr,i,min);
            //for (int j=len-1;j>i;j--){
//                if(arr[j] < arr[min]){
//                    min = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
        }
    }

    static int findMin(int [] arr,int start,int end){
        int min = start;
        for (int i=start;i>end;i--){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }

    static  void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
