package Searching.LinearSearching;

public class SearchInString {
    public static void main(String[] args) {
        System.out.println(searchString("ashish",'h'));
    }

    static int searchString(String str,char target){
        if(str.isEmpty()){
            return -1;
        }

        for (int idx=0;idx<str.length();idx++){
            char currChar = str.charAt(idx);
            if(currChar == target){
                return idx;
            }
        }

        /*
        for(char currChar: str.toCharArray()){
            if(currChar == target){
                return str.indexOf(currChar) ;
            }
        }
        */

        return -1;
    }
}
