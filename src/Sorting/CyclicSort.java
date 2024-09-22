package Sorting;
import java.util.Arrays;
// we use cyclic sort when numbers are given from range 1 to N
 /* initial approach based on explanation only
         while(i != arr[i] -1){
             int temp = arr[i]; // index = temp
             // temp - 1 to ensure that value = index -1 // i.e. 3 should be in 2nd index in the array
             arr[i] = arr[temp - 1];
             arr[temp-1] = temp;
         }
          */
public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int [] arr){
       int i = 0;
       while(i < arr.length){
           // the correct index for 1 is at 0. therefore, correctIndex = arr[i] - 1;
           int correctIndex = arr[i] - 1;
           if(arr[i] != arr[correctIndex]){
               swap(arr,i,correctIndex);
           }else{
               i++;
           }
       }
    }

    static void swap(int [] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
//        int temp = arr[i];
//        arr[i] = arr[correctIndex];
//        arr[correctIndex] = temp;
    }

}
