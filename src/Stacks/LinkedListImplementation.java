package Stacks;

public class LinkedListImplementation {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        public  Node head;

        public  boolean isEmpty(){
            return head == null;
        }

        // stack push functionality with linked list
        public  void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public  int pop(){
            if(isEmpty()){
                System.out.println("Nothing to remove. Stack empty");
                return 0;
            }

            Node temp = head;
            head = head.next;
            return temp.data;
        }

        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
