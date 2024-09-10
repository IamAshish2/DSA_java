package RecursionIntermediate;
//Q.->  Move all the 'x' chars to the end of the string
public class MoveXToEnd {
    static String newStr = "";
    public static void main(String[] args) {
        move("axbcxxd",0,0);
    }

    static void move(String  str,int idx,int count){
        // base case
        if(idx == str.length()-1){
            for (int i=0;i<count;i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(idx);

        if(ch != 'x'){
            newStr += ch;
        } else{
            count++;
        }
        move(str,idx+1,count);
    }
    // Same method usuage
        /*  if(idx == str.length()-1){
            for (int i=0;i<count;i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(idx);
        if(ch != 'x'){
            newStr += ch;
            move(str,idx+1,count);
        } else{
            count++;
            move(str,idx+1,count);
        }

         */
}
