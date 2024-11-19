package LinkedList.Revision;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        // if tail is null, that means we are inserting the first element in the linked list
        // so, head and tail should point to the same Node
        if(tail == null){
            tail = head;
        }

        // increment the size of the linked list
        size++;
    }

    public void display(){
        Node temp = head;
       while (temp != null){
           System.out.print(temp.data + "->");
           temp = temp.next;
        }
        System.out.println();
    }

    public void insertAtLast(int data){
        Node node = new Node(data);
        tail.next = node;
    }

    private class Node{
         private int data;
        private Node next;

        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }

        // in case we just create a node and don't define what it is pointing to next i.e. next=null
        public Node(int data){
            this.data = data;
        }


    }
}
