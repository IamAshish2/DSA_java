package Patterns;

import java.util.Scanner;

public class DivisorPattern {
    public static void main(String[] args) {
        // print a pattern that visualizes the divisors of a number n
        System.out.println("Enter a number to print it's divisor pattern: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
      for (int i=1; i<=num;i++){
          for (int j = 1;j<=num;j++){
              if(i % j == 0 || j % i ==0){
                  System.out.print("* ");
              }else{
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
    }
}
