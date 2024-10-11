package Recursion2.Refresher;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(30000456,0));
    }

    static int countZeros(int n,int count){
        if(n == 0){
            return count;
        }

        if(n%10 == 0){
//            count += 1; does same thing as the below statement, can use this and just call the function outside
            // if statement block
            return  countZeros(n/10,++count);
        }
        return  countZeros(n/10,count);
        // same thing
//        return  countZeros(n/10,n%10 == 0 ? ++count : count);
    }
}
