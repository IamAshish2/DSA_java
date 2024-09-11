package LinkedList;

public class LL {
    // the head that points to the first element in the linked list
     Node head;
     private int size;// to keep track of the size of the linked list

    LL(){
        this.size = 0;
    }

     class Node{
        // the link to the next node
        Node next;
        // the data of the node
        int data;

        // every time a new node is created it initially points to null
        Node(){
            this.next = null;
            size++;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(43);
        System.out.println("Deleted from start " + list.deleteFirst());
        System.out.println("Delted from last " + list.deleteLast());
        list.printList();
        System.out.println(list.getSize());
    }

//    add first
     void addFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last
    void addLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // delete first
    int deleteFirst(){
        if(head == null){
            System.out.println("the list is empty!Nothing to delete");
            return 0;
        }

        Node temp = head;
        head = head.next;
        size--;
        return temp.data;

    }

    // delete last
    int  deleteLast(){ // return type is int because we are returning the value of the last deleted element in the list
        if(head == null){
            System.out.println("Nothing to delete!");
            return 0;
        }

        size--;
        if (head.next == null){
            head = null;
            return 0;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        //another approach
       /*
        while(secondLastNode.next.next != null){
            secondLastNode = secondLastNode.next;
        }
        */

        secondLastNode.next = null;
        return lastNode.data; // item that is delted
    }

    int getSize(){
        return size;
    }


    // print list
    void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }
}
