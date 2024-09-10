package RecursionIntermediate;

public class FAndLOccurenceOfElement {

    public  static  int first = -1;
    public static int last = -1;

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurence(str,str.length()-1,'a');
    }

    static void findOccurence(String str,int idx,char ele){
        char currChar = str.charAt(idx);

        if(currChar == ele){
            if(last == -1) {
                last = idx;
            }else{
                first = idx;
            }
        }

        if(idx == 0){
            System.out.println("first occurence " + first);
            System.out.println("second occurence " + last);
            return;
        }
        findOccurence(str,idx-1,ele);
    }
}
