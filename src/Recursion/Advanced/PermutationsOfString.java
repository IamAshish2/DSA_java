package Recursion.Advanced;

public class PermutationsOfString {
    public static void main(String[] args) {
        printPermutation("abc","");
    }

    static void printPermutation(String str, String permutation){

        // base case. when the str length becomes 0 recursively print the permutation
        // formed and return back to actual state of str
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i); // current char
            // new string excluding the char at current index and adding the remaing char after the current char/index to newString
            String newString = str.substring(0,i) + str.substring(i+1);
            // recursive function calls- goes till i<str.length() i.e. 0,1,2 in this case
            printPermutation(newString,permutation + currChar);
        }
    }
}
