package Collection_framework;
import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
        // doesn't guarantees the order of insertion
        HashSet cricketers=new HashSet();
        cricketers.add("sachin");
        cricketers.add("dhoni");
        cricketers.add("virat");
        System.out.println("Cricketers: " + cricketers);
        HashSet footballers=new HashSet();
        footballers.add("messi");
        footballers.add("ronaldo");
        System.out.println("footballers: " +footballers);
        HashSet players=new HashSet();
        players.add("nadal");
        System.out.println(players);

        // addAll() adds elements in one collections based class to another
        players.addAll(cricketers);
        players.addAll(footballers);
        System.out.println(players);

        // removeAll() removes all elements from cricketers and footballers form players
        players.removeAll(cricketers);
        System.out.println(players);
        players.removeAll(footballers);
        System.out.println(players);
        
       
    }
    
}
