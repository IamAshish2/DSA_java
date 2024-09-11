package Recursion.RecursionBeginner;

public class isStringPalindrome {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(isPalindrome(str,0,str.length()-1));
    }

    static boolean isPalindrome(String str,int start,int end){
        if(start >= end){
            return true;
        }

        char currChar = str.charAt(start); // the char at start pos
        char endChar = str.charAt(end); // the char at end pos
        if(currChar != endChar){
            return false;
        }
        
        return isPalindrome(str,start + 1, end -1);
    }
}
