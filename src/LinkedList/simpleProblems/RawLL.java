package LinkedList.simpleProblems;

public class RawLL {
     Node head;
    RawLL(){
        this.head = null;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        RawLL ll = new RawLL();
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addLast(7);
        ll.addFirst(3);
        ll.addLast(8);
        ll.addFirst(2);
        System.out.println("index of 7 is " + ll.indexOf(7));
        ll.iterate();
//        ll.head = ll.reverseRecursive(ll.head);
        System.out.println();
        ll.iterate();
    }

    // find index of a value in linked list
    int indexOf(int data){
        Node currNode = head;
        int idx = 0;
        while (currNode.next != null){
            idx++;
            if(currNode.data == data){
                return idx -1;
            }
            currNode = currNode.next;
        }
        return 0;
    }

    boolean isEmpty(){
        return head == null;
    }

    void addFirst(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
//            System.out.println(head.data);
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    int deleteFirst(){
        if(isEmpty()){
            return -1;
        }

        Node temp = head;
        head = head.next;
        return temp.data;
    }

    int deleteLast(){
        if(isEmpty()){
            return -1;
        }

        if(head.next == null){
            Node last = head;
            head = null;
            return last.data;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
        return lastNode.data;
    }

    void iterate(){
        Node currNode = head;
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    // reverse a linked list iterative method
    void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }
    // reverse a linked list recursive method
    Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return  head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}