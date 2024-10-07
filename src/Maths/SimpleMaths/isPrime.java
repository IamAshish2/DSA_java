package Maths.SimpleMaths;

public class isPrime {
    public static void main(String[] args) {
//        System.out.println(checkPrime(11));
        primeNumbers(40);
    }

    static boolean checkPrime(int num){
        if(num <=1) return false;

        int i = 2;

        /*
        int checkPoint = (int)Math.sqrt(num);
        while(i <= checkPoint){
            if(num % i == 0) return  false;
            i++;
        }
         */

        while(i * i <= num){
            if(num % i == 0) return false;
            i++;
        }
        return true;
    }

    static void primeNumbers(int num){
        for (int i=2;i<num;i++){
            if(checkPrime(i)) System.out.println(i + " is prime");
        }
    }
}
