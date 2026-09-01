import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        //What is Streams in Java : It is nothing but tool for processing data in sequntial manner which will go through
        //chain of operations

        List<Integer> list = new ArrayList<>(List.of(5,12,7,14));

        Stream<Integer> s = list.stream();
        s = s.filter(x -> x > 10);
        s = s.map(x -> x*2);
        s.forEach(x -> System.out.println(x));// s.forEach(System.out::println)

        System.out.println("*******************************");

        list.stream().filter(x->x>10)
                .map(x -> x*2)
                .forEach(System.out::println);
    }
}
