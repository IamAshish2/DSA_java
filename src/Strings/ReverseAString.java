package Strings;

public class ReverseAString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ashish");

        int front;
        for(int i=0;i<sb.length() /2 ;i++){
          front = i;
         int back = sb.length() - 1 - i; // 6 - 1 -0 for first ele

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }

        System.out.println(sb);
    }
}
