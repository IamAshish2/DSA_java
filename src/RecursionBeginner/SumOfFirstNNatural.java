package RecursionBeginner;

public class SumOfFirstNNatural {
    public static void main(String[] args) {
        System.out.println("The sum of 15 is (recursively) " + calculateSum(15));
        printSum(1,5,0);
    }


    // printing using start(i),end(n) and sum variable
    static void printSum(int i,int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);
        // this will print the value of i after base case. the function below/that called
        // printSum() recursively : i = 4,3,2,1 will be printed.
        System.out.println(i);
    }

    // calculate sum using the num itself
    static int calculateSum(int num){
        if(num == 0 ){
            return 0;
        }

        return num + calculateSum(num - 1);
    }
}
