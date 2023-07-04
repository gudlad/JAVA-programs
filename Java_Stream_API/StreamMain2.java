package Java_Stream_API;

import java.util.*;
import java.util.stream.Stream;

public class StreamMain2 {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(45,6,6,7,9,8,10,12);
        Stream<Integer> data= nums.stream();
        // once the stream is consumed it can't be reused
         long count=data.count(); // stream is consumed
         System.out.println(count);
        //  data.forEach(System.out::println);   method reference
        // not work as stream is already consumed


        nums.stream()
                .filter(x->x%2==1)
                .sorted()
                .map(x->x*x)
                .forEach(x-> System.out.println(x));

    }
}
