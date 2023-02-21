package Collection_framework;

import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque ad=new ArrayDeque();
        // add from front or rear
        // remove from front or rear
        ad.add(11);
        ad.add("messi");
        ad.add(99);
        ad.add(true);

        // this data structure can be used to implement 
        // others data structures also like stack,linked list
        System.out.println(ad);
        ad.addFirst(12);
        ad.addLast(44);
        System.out.println(ad);

        ad.removeFirst();
        ad.removeLast();
        System.out.println(ad);
        
    }
    
}
