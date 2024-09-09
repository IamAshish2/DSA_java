package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {100,20,30,433,55};
        int n = arr.length;
        int j;

       for(int i=1;i<n;i++){
           int currentEle = arr[i];
           j = i-1;
           while(j >= 0 && currentEle < arr[j]){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = currentEle;
       }

        for(int ele: arr) System.out.println(ele);
    }
}
