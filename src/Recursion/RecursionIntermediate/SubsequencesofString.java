package Recursion.RecursionIntermediate;

public class SubsequencesofString {
    public static void main(String[] args) {
        subSequences("abc",0,"");
    }

    static void subSequences(String str,int idx , String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        // to be : choosen
        subSequences(str,idx+1,newString + currChar); // the case where char is choosen

        // not to be : skipped
        subSequences(str,idx+1,newString); // the case where char is not choosen
    }
}

// flow of the program
//subSequences("abc", 0, "")
//│
//    -----── subSequences("abc", 1, "a")       // Include 'a'
//│   ├── subSequences("abc", 2, "ab")  // Include 'b'
//│   │   ├── subSequences("abc", 3, "abc")  // Include 'c' -> prints "abc"
//│   │   └── subSequences("abc", 3, "ab")   // Skip 'c' -> prints "ab"
//│   └── subSequences("abc", 2, "a")   // Skip 'b'
//│       ├── subSequences("abc", 3, "ac")   // Include 'c' -> prints "ac"
//│       └── subSequences("abc", 3, "a")    // Skip 'c' -> prints "a"
//│
//        └── subSequences("abc", 1, "")        // Skip 'a'
//    ├── subSequences("abc", 2, "b")   // Include 'b'
//    │   ├── subSequences("abc", 3, "bc")   // Include 'c' -> prints "bc"
//    │   └── subSequences("abc", 3, "b")    // Skip 'c' -> prints "b"
//    └── subSequences("abc", 2, "")    // Skip 'b'
//        ├── subSequences("abc", 3, "c")    // Include 'c' -> prints "c"
//        └── subSequences("abc", 3, "")     // Skip 'c' -> prints ""



