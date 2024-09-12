package Stacks;
import java.util.Stack;

// main functions -> push() pop() peek()
public class Pilot {
    static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) {

        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.pop(); // removes the top element in stack
        printStack();
    }

    static void printStack(){
        for (var ele : stack) System.out.println(ele);
    }
}
