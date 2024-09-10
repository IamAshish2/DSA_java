package RecursionIntermediate;

public class RemoveDuplicate {
    public static boolean [] map = new boolean[26];
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicate(str,0,"");
    }

    static void removeDuplicate(String str,int idx,String newStr){
        if(idx == str.length()-1){ // or idx == str.length()
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicate(str,idx+1,newStr);
        } else{
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str,idx+1,newStr);
        }
    }
}
