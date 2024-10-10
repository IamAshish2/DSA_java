package Maths.SimpleMaths;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.3f",squareRoot(40,3));
    }

    // iterative method for finding the square root
    public static int findSquareRoot(int num){
        int i = 2;
        while(i*i <= num){
            if(i*i == num){
                return i;
            }
            i++;
        }
        return -1;
    }

//    O(logn)
    public  static double squareRoot(int num,int percisionVal){
        int i = 0;
        int j= num;
        while(i <= j){
            int mid = i + (j-i)/2;
            if(mid * mid == num){
                return  mid;
            }else if(mid * mid  < num){
                i = mid + 1;
            }else{
                j = mid -1;
            }
        }

        double sqrt = 0.0d;
        double incrementvalue = 0.1;
        for (int s = 0; s<percisionVal;s++){
            while(sqrt*sqrt <= num){
                sqrt += incrementvalue;
            }
            sqrt -= incrementvalue;
            incrementvalue /= 10;
        }
        return sqrt;
    }


}
