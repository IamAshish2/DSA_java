package Recursion.RecursionIntermediate;
// Print all the unique subsequences of substring (aaa)

import java.util.HashSet;

// We will use hashset for this
public class UniqueSubsequences {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        getUniqueSubsequences(str,0,"",set);
    }

    static void getUniqueSubsequences(String str,int idx,String newString,HashSet<String> set){

        if(idx == str.length()){
            if (set.contains(newString)) {
               return;
            }
            System.out.println(newString);
            set.add(newString);
            return;
        }
        char currChar = str.charAt(idx);

        // to be
        getUniqueSubsequences(str,idx+1,newString + currChar,set);

        // not to be
        getUniqueSubsequences(str,idx+1,newString,set);
    }
}

