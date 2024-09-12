package LinkedList.simpleProblems;

public class RawLL {
    Node head;

    RawLL() {
        this.head = null;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
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
        ll.head = ll.reverseRecursive(ll.head);
        System.out.println();
        ll.iterate();
    }

    // find index of a value in linked list
    int indexOf(int data) {
        Node currNode = head;
        int idx = 0;
        while (currNode.next != null) {
            idx++;
            if (currNode.data == data) {
                return idx - 1;
            }
            currNode = currNode.next;
        }
        return 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
//            System.out.println(head.data);
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    int deleteFirst() {
        if (isEmpty()) {
            return -1;
        }

        Node temp = head;
        head = head.next;
        return temp.data;
    }

    int deleteLast() {
        if (isEmpty()) {
            return -1;
        }

        if (head.next == null) {
            Node last = head;
            head = null;
            return last.data;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
        return lastNode.data;
    }

    void iterate() {
        Node currNode = head;
        if (isEmpty()) {
            System.out.println("list is empty");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    // reverse a linked list iterative method
    void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
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
    Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // recursive calls to create that backward pointing linked list and assign the last node as the new head
        Node newHead = reverseRecursive(head.next);

        // we assume as we go up the stack, that for every node , it is the head
        // -> so, say for 2 (2->3->4->null) we assume 2 to be it's head
        // so when we return from recursive call with (head->4->3->) and our initial
        // linked list going up the stack looks like (2->3->4->null)
        // here, since we assumed that 2 is going to be our head in this level
        // if we do, head.next i.e it is now pointing towards 3 and head.next.next = head i.e. now pointing
        // towards the head of current upward recursion process -> itself(head)
        // meaning ----> with this operation the rightward node is pointing towards leftward node
        // something like this now->>>>>>> head->4->3->2
        head.next.next = head;

        // now what this is doing is, since we successfully pointed rightward node towards leftward node which is in reverse direction
        // we can now break the connection we originally had with our connection node previously.
        // before (1->2->3->4->null)  and (head->4->3) where 2 (our head at this point going upward) is pointing
        // toward 3 and 3 towards 2 after head.next.next action
        //after head.next (head->4->3->2->) and we break the connection with 3. and what remains is (1->2)
        head.next = null;

        // at last we return our new head i.e. the last node of the previous node
        // happy reversing ✅✅✅✅✅
        return newHead;
    }
}