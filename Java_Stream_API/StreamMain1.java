package Java_Stream_API;
import java.util.*;
import java.util.stream.Collectors;
public class StreamMain1{
public static void main(String[] args) {
    // with stream and without stream 

    //* Q) create a list and filter all even number from list

    // ways of creating a list
    List<Integer> ImmutableList= List.of(1,2,3,4); 
    System.out.println(ImmutableList);
    // above creates an immutable list
    // we can't modify the list


    //! without stream api we have to write this much code
    List<Integer> list2=Arrays.asList(1,2,3,4,8,12,14);
    // //? List list3=new ArrayList<>();

    // List<Integer> list3=new ArrayList<>(); 

    // for(Integer i:list2)
    // {
    //     if(i%2==0)
    //         list3.add(i);
    // }
    // System.out.println(list3);


    //! using stream api ex 1:
    // create a  stream
    //? Stream<Integer> stream=list2.stream();
    // use filter function and pass a lambda to filter the items
    //? List<Integer> result= stream.filter(i->i%2==0).collect(Collectors.toList());

    List<Integer> result = list2.stream().filter(i->i%2==0).collect(Collectors.toList());
    System.out.println(result);
    List<Integer> result2=list2.stream().filter(i-> i>10).collect(Collectors.toList());
    System.out.println(result2);
}
}