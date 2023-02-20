package Collections;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(11);
        ll.add("messi");
        ll.add(99);
        ll.add(true);

        // methods
        System.out.println(ll.contains("ronaldo"));
        System.out.println(ll.peek());
        System.out.println(ll.poll());
        System.out.println(ll);

        // others methods
        /*
        addFirst()
        addLast()
        removeFirst()
        removeLast()
        size()
        ... 
        */

    }
    
    
}
