package Java_Stream_API;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //1. filter(predicate)
        // filter takes a predicate
        // predicate is a boolean valued function
        // predicate function true/false for each element
        // use lambda for predicate
        // e-> { e>10}
        List<String> names=List.of("aman","ankit","abhinav","durgesh");
        // filter elements starting with a
        List<String> newNames=names.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
        System.out.println(newNames);

        //2. map
        // we perform a operation on each element in the collection
        // map(function)
        // square each number
        List<Integer> numbers=List.of(23,4,56,2,12);
        //List<Integer> newNumbers=numbers.stream().map(e->e*e).collect(Collectors.toList());
        List<Integer> newNumbers=numbers.stream().map(e->e*e).toList();
        System.out.println(newNumbers);

        // 3. foreach
        numbers.stream().forEach(System.out::println);

        // 4. sort
        numbers.stream().sorted().forEach(System.out::println);
        // for custom sorting using comparators

        // 5. min
        Integer min=numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("min ="+min);

        // 6. max
        Integer max=numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("max ="+ max);

    }
}
