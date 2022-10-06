package Chapter17.Streams;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
//        Stream<Integer> numbers =  Stream.empty();
//
//        Stream<Integer> numbers2 = Stream.of(10,20,30,40);

//        Supplier<Integer> supplier = ()-> new Random().nextInt(100);
//        Stream<Integer> numbersList = Stream.generate(supplier);/*This can be used to generate an infinite stream*/
//        numbersList.forEach((number)-> System.out.println(number));

        UnaryOperator<Integer> unaryOperator = (num) -> num+1;
        Stream<Integer> badCharacters = Stream.iterate(1,unaryOperator)
                .limit(10);
        badCharacters.forEach((num)-> System.out.println("number = " + num));

        UnaryOperator<Character> unaryOperator2 = (character) -> ++character;
        Stream<Character> badCharacters2 = Stream.iterate('a',unaryOperator2)
                .limit(10);
        badCharacters2.forEach((c)-> System.out.println("character = " + c));
    }







//    public static  Stream<Integer> getStream(){
//        return Stream.empty();
//    }
}
