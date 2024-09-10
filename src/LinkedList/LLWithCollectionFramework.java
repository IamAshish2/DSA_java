package LinkedList;

import java.util.LinkedList;

public class LLWithCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
//        System.out.println(list.removeFirst()); // return type available
//        System.out.println(list.removeLast());
        System.out.println("The size of the linked list " + list + " is " + list.size());
//        System.out.println(list);
        for (int i=0;i<list.size();i++){
//            if (list.get(i) == value) search values within the linkedList
            System.out.print(list.get(i) + "->");
        }
        System.out.println("Null");
    }
}
