package Maths.SimpleMaths;
// find prime till n
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 37;
        boolean [] primes = new boolean[n+1];
        sieve(n,primes);
    }

    private static void sieve(int n, boolean[] primes) {
        for (int i = 2; i <= n ; i++) {
            if(!primes[i]){
                for (int j = i*i; j <=n ; j+=i) {
                    primes[j] = true;
                }
            }
        }

        // print the prime numbers
        for (int i = 2; i <= n ; i++) {
            if(!primes[i]) System.out.print(i + " ");
        }
    }


}
