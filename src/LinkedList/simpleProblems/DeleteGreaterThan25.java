package LinkedList.simpleProblems;
import  java.util.Scanner;
public class DeleteGreaterThan25 {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        DeleteGreaterThan25 ll = new DeleteGreaterThan25();

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number of inputs to add in the list: ");
        while (true){
            if(sc.hasNextInt()){
                 n = sc.nextInt();
                break;
            }else{
                System.out.println("Please enter a valid number n!");
            }
        }

        for(int i=0;i<n;i++){
            System.out.println("Enter the " + (i+1) +"th number");
            int num = sc.nextInt();
            ll.addLast(num);
        }

        System.out.println("Checking if any input by the user is greater than 25: ");
        ll.deleteGreaterThan25();
        System.out.println("Printing the list: ");
        ll.iterate();
    }

    void iterate(){
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
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
        if(head == null){
            return -1;
        }

        Node temp = head;
        head = head.next;
        return temp.data;
    }

    void deleteGreaterThan25(){
        if(head != null && head.data > 25){
            deleteFirst();
        }

        Node prevNode = head;
//        assert head != null;
        Node currNode = head.next;

        while (currNode.next != null){
            if(currNode.data > 25){
                prevNode.next = currNode.next;
            }else{
                prevNode = currNode;
            }

            currNode = currNode.next;
        }
    }
}
