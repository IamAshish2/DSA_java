package Recursion.RecursionBeginner;
//Write a Java recursive method to count the number of occurrences of a specific element in an array.
public class OccurenceOfAnEle {
    public static void main(String[] args) {
        int [] arr = {1,2,45,334,61,1,64,1,53,24,1};
        System.out.println(countOccurence(arr,20,0,0));
    }

    static int countOccurence(int [] arr,int ele,int idx,int count){

        if(idx == arr.length){
            return count;
        }

        if(ele == arr[idx]){
            count++;
        }
        return countOccurence(arr,ele,idx+1,count);
    }
}
