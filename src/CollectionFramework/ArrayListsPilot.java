package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsPilot {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);

//        numbers.add(0,0);
        numbers.addFirst(0);
        System.out.println(numbers);


        numbers.remove(3);
        System.out.println(numbers);
        numbers.add(0,5);

        Collections.sort(numbers);
        System.out.println(numbers);


    }

}
