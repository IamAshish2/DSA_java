package Recursion2.Arrays;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        // return the first index || just move the pointer to the last to get value from last and not the first index
        int [] arr = {3,2,1,18,19};
        System.out.println(linearSearch(arr,0,18));

        // return all the indexes
        int [] arr2 = {3,4,5,6,3,9,89,3,21,89};
        ArrayList<Integer> indexes = findAllIndexes(arr2,0,3,new ArrayList<Integer>());
        System.out.println(indexes);

        // return arraylist without taking it in parameter
        System.out.println(findAllIndexes2(arr2,0,3));
    }

    // return the index of the element found -> return -1 if not found
    static int linearSearch(int [] arr,int ptr,int val){
        // base case
        if(ptr == arr.length -1){
            return -1;
        }

        if(arr[ptr] == val){
            return ptr;
        }

        return linearSearch(arr,ptr+1,val);
    }


    static ArrayList<Integer> findAllIndexes(int [] arr, int ptr, int val, ArrayList<Integer> indexes){
        if(ptr == arr.length -1){
            return indexes;
        }

        if(arr[ptr] == val){
            indexes.add(ptr);
        }

        return findAllIndexes(arr,ptr+1,val,indexes);
    }

    // same thing as above but not taking arraylist variable as a parameter
    static ArrayList<Integer> findAllIndexes2(int [] arr, int ptr, int val){
        ArrayList<Integer> indexes = new ArrayList<>();
        if(ptr == arr.length -1){
            return indexes;
        }

        // this will contain answer for that function call only
        if(arr[ptr] == val){
            indexes.add(ptr);
        }

        ArrayList<Integer> ansFromBelowCalls =  findAllIndexes2(arr,ptr+1,val);

        indexes.addAll(ansFromBelowCalls);

        return indexes;
    }
}
