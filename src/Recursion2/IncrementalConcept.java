package Recursion2;

public class IncrementalConcept {

    public static void main(String[] args) {
        sum(5);
    }

    /* n-- vs n++

    n-- -> uses the value of n first and then decrement later
    but it won't work with recursion because if we are using the value first and decrementing later
    the value of n will be n for all function calls i.e. STACK OVERFLOW ERROR WILL OCCUR
    hence, we should use --n.
    */
    static void sum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
//        sum(n--); this won't work
        sum(--n);
    }
}
