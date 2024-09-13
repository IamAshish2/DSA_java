package Leetcode.Arrrays;
/* 1832. Check if the Sentence Is Pangram
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
 */
public class Leetcode1832 {
    public static void main(String[] args) {
    String  sent = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(sent.length());
        System.out.println(checkIfPangram(sent));
    }
    public static boolean checkIfPangram(String sentence) {
        // initialize an array of all letters
        char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        // loop throught all letters
        for (char letter: letters){
            // check if sentence does not contain any letter ; if so return false directly
            if(!sentence.contains(String.valueOf(letter))) return  false;
        }
        // if it passes the for loop, meaning all the letters are present in the sentence, return true
        return true;
    }
}
