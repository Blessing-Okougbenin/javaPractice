package Chapter17.Streams;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);
        Consumer<Integer> consumer = (number)-> System.out.println("This is my "+ number);
//        numbers.forEach(consumer);

        numbers.stream()
                .filter((number)-> number%20 != 0)
                .forEach(consumer);

        Map<Integer, String> map = Map.of(
                10,"A",
                20,"B",
                30,"C"
        );
        BiConsumer<Integer,String> biConsumer = (number,letter)-> System.out.println(number + " is equal to " + letter);
        map.forEach(biConsumer);

    }
}
