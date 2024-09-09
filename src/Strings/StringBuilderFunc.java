package Strings;

public class StringBuilderFunc {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ashish");
//        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index n
//        sb.setCharAt(0,'H');
//        System.out.println(sb);

        // append char at index n
//        sb.insert(0,'h');
//        System.out.println(sb);

        // reverse the string
        sb.reverse();
    }
}
