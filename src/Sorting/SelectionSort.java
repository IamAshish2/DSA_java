package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {100,20,30,433,55};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int minEle = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minEle]){
                    minEle = j;
                }
            }
            int temp = arr[minEle];
            arr[minEle] = arr[i];
            arr[i] = temp;
        }

        for(int ele : arr) System.out.println(ele);
    }
}
