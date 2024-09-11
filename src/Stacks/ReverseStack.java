package Stacks;

import java.util.Stack;

class ReverseStack{
    public static void main(String[] args) {
        Stack<Integer> numStack = new Stack<>();
        numStack.push(1);
        numStack.push(2);
        numStack.push(3);

        insertBottom(numStack,4);
        reverseStack(numStack);
        while (!numStack.isEmpty()){
            System.out.println(numStack.peek());
            numStack.pop();
        }
    }

    static void insertBottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }

        int top = st.pop();
        insertBottom(st,data);
        st.push(top);
    }

    static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int top = st.pop();
        reverseStack(st);
        insertBottom(st,top);
    }
}