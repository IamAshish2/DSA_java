package Recursion.RecursionBeginner;
// Write a Java recursive method to calculate the product of all numbers in an array.
public class ProductOfArr {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        System.out.println(calcProduct(arr,0,1));
    }

    static int calcProduct(int [] arr,int idx,int product){
        if(idx == arr.length){
            return  product;
        }
        product *= arr[idx];
        return calcProduct(arr,idx+1,product);
    }
}
