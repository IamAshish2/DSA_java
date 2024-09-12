package Misc;
//Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
public class PythagoreanTriplet {
    public static void main(String[] args) {
        int [] arr = {3,1,4,6,5};
        System.out.println(isPythagoreanTriplet(arr));

    }

    static boolean isPythagoreanTriplet(int [] arr){
        for (int i=0;i<arr.length;i++){
            int aSquared = arr[i] * arr[i];
            for(int j=i+1;j<arr.length;j++){
                int bSquared = arr[j] * arr[j] ;
                for (int k = j+1;k<arr.length;k++){
                    int cSquared = arr[k] * arr[k] ;
                    if(aSquared == bSquared + cSquared || bSquared == aSquared + cSquared || cSquared == aSquared + bSquared){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
