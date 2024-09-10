package Stacks;

import java.util.Stack;

public class PushAtTheBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
//        pushBottom(4,s);
        reverseStack(s);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

    static void pushBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(data,s);
        s.push(top);
    }

    static  void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(top,s);
    }
}
