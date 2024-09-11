package Recursion.RecursionBeginner;
//Write a Java recursive method to find the length of a given string.
public class LengthOfAString {
    public static void main(String[] args) {
        System.out.println(calcLength("ashish"));
    }

    static int calcLength(String str){
        //base case
        if(str.isEmpty()){
            return 0;
        }

        // Recursive case: remove the first character of the
        // string and recursively call the method
        // with the remaining substring, and add 1 to the length
        return  1 + calcLength(str.substring(1));
    }
}
