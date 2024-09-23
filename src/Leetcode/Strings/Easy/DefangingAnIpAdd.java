package Leetcode.Strings.Easy;
/* leetcode 1528 shuffle string
You are given a string s and an integer array indices of the same length.
 The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Example 1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

Example 2:
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
 */
public class DefangingAnIpAdd {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
/* solution using character aRray and a new String variable
    public static  String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        str.insert(4,"h");

        String newStr = "";
        char [] add = address.toCharArray();
        for(int i =0;i<add.length;i++){

            if(add[i] == '.'){
                newStr += "[.]";
            }else{
                newStr += add[i];
            }
        }
        return newStr;
    }

 */

    // optimal solution with 0(n) time complexity
    // beats 100% on leetcode
    public static String defangIPaddr(String address) {
    StringBuilder newStr = new StringBuilder();
    char ch;
    for(int i =0;i<address.length();i++){
        ch = address.charAt(i);
        if(ch == '.'){
            newStr.append("[.]");
        }else{
            newStr.append(ch);
        }
    }
    return newStr.toString();
}
}
