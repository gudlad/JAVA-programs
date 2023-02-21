package Collection_framework;

import java.util.Collections;
// Collections is a utility class
// provides many methods that can be used on data structures
import java.util.PriorityQueue;

public class Priority_queue {

    public static void main(String[] args) {
        
        PriorityQueue pq=new PriorityQueue();
        // gives priority to every element 
        // either in ascending order or descending order
        // by default gives priority to elements that are small

        pq.add("gitesh");
        pq.add("jeetesh");
        pq.add("dinesh");
        pq.add("mahesh"); 
        pq.add("suresh");


        PriorityQueue pq2=new PriorityQueue(Collections.reverseOrder());
        // gives priority to the elements thar are large
        
        pq.add("gitesh");
        pq.add("jeetesh");
        pq.add("dinesh");
        pq.add("mahesh"); 
        pq.add("suresh");

        System.out.println(pq);
}

}