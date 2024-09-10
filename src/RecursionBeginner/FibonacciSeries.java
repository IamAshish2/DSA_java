package RecursionBeginner;
// print fibonacci series up to n'th term
public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
//        fibonacciSeries(5,first,second);
        recursiveFibonacci(5,first,second);
    }

    // iterative method
    static void fibonacciSeries(int n,int first,int second){
        System.out.println(first);
        System.out.println(second);

        int sum;
        for(int i=second;i<=n -2 ;i++){
            sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;
        }
    }

    // recursive method to print fibonacci series || BAD USUAGE

  /*  static void recursiveFibonacci(int n,int first,int second){
        if(n == 2){ // since we have already printed the first and second elements
            return;
        }

        int sum = first + second;
        first = second;
        second = sum;
        System.out.println(sum);

        recursiveFibonacci(n-1,first,second);
    }
    */


    static void recursiveFibonacci(int n, int first, int second) {
        if (n <= 0) {
            return; // Base case: no more numbers to print
        }

        // Print the current Fibonacci number
        System.out.println(first);

        // Calculate the next Fibonacci number
        int sum = first + second;
        first = second;
        second = sum;

        // Recursively call for the next number
        recursiveFibonacci(n - 1, first, second);
    }

}
