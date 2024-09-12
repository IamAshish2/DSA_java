package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {100,20,30,433,55};
        int n = arr.length;
        int j;

       for (int i=1;i<n;i++){
           int currEle = arr[i]; // 2 index 30 // {20,100,30,433,55}
           j = i -1; // index 1 : 100
           while (j >=0 && currEle < arr[j]){
               arr[j+1] = arr[j];
               j--;
           }
           // j is -1 here : index 0 = current element
           arr[j+1] = currEle;
       }

        for(int ele: arr) System.out.println(ele);
    }
}
