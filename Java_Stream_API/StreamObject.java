package Java_Stream_API;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // ways of getting stream object in java
        // 1. create an empty stream
        Stream<Object> emptyStream= Stream.empty();
        //emptyStream.forEach(e->{ System.out.println(e);} );

        // 2 . using Stream.of()
        String names[]={"Durgesh","Uttam","Ankit","Arun","Dev"};
        Stream<String> nameStream=Stream.of(names);
        nameStream.forEach(e-> {
            System.out.println(e);
        });

        // 3. Arrays.stream()
        IntStream stream = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        stream.forEach(e-> {
            System.out.println(e);
        });

        // 4. List,Set
        // stream() method available directly on the List,Set.

        // 5 Stream.of
        Stream<String> names2= Stream.of(names);

    }
}
