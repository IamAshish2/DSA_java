package Recursion.RecursionBeginner;

//Write a Java recursive method to reverse a given string
public class ReverseString {
    public static void main(String[] args) {
        String str = "ashish";
        System.out.println(reverse(str));
    }

    static String reverse(String str){
        if(str.length() == 1 || str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
