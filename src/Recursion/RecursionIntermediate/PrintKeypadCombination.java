package Recursion.RecursionIntermediate;
// Print keypad combination
public class PrintKeypadCombination {
    public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) {
        printCombination("23",0,"");
    }


    static void printCombination(String numStr,int idx,String combination){
       if(idx == numStr.length()){
           System.out.println(combination);
           return;
       }

        char currChar = numStr.charAt(idx);
        String mappingKeypad = keypad[currChar -'0']; // subtracting '0' to convert from ASCII to integer type

        for (int i=0;i<mappingKeypad.length();i++){
            printCombination(numStr,idx+1,combination + mappingKeypad.charAt(i));
        }
    }
}
