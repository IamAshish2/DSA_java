package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(checkPalindrome(str));
    }

    static boolean checkPalindrome(String str){
        int mid = str.length() / 2;
        int end = str.length() - 1;
        for (int i=0;i<mid;i++){
            // check for the character at oppostie index
            // check for character at first and last and decrementing characters for matching values
            // if found to be different return false
            if (str.charAt(i) != str.charAt(end)){
                return false;
            }
            end--;
        }
        // return true if the string is palindrome
        return true;
    }
}
