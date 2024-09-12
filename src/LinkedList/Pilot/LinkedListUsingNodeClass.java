package LinkedList.Pilot;

public class LinkedListUsingNodeClass {
    public static Node Head;

    public static void main(String[] args) {
        insertATFirst(43);
        insertATFirst(33);
        iterate();
    }

    static  void insertATFirst(int data){
        Node newNode = new Node();
        // insert data into the node

        if(Head == null){
            Head = newNode;
            return;
        }
        newNode.Data = data;
        // insert the next link of the newNode to be the link of previous first element i.e. Head
        newNode.Next = Head;
        // change the head to point to the newNode
        Head = newNode;
    }

    static Node deleteFirst(){
        Node temp = Head;
        Head = Head.Next;
        return temp;
    }


    static  void insertLast(int data){
        Node currentNode = Head;
        while (currentNode != null){
            currentNode = currentNode.Next;
        }

        Node newNode = new Node();
        newNode.Data = data;
        currentNode.Next = newNode;
    }

    static void iterate(){
        System.out.println("Printing the List: ");
        Node currentNode = Head;
        while(currentNode != null){
            Node.Display();
            currentNode = currentNode.Next;
            System.out.println(currentNode.Next);
        }
    }

}
