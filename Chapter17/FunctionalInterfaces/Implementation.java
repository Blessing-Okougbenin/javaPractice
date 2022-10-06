package Chapter17.FunctionalInterfaces;

import java.util.Random;
import java.util.function.*;

public class Implementation {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (number)-> System.out.println("This is my "+ number);
        consumer.accept(190);

        BiConsumer<String, String> biConsumer = (name, gender)-> System.out.println("My name " +
                "is "+ name + " and i'm a " + gender);
        biConsumer.accept("Blessing","god");

//        BiConsumer<String,String> biConsumer1 = (number, state)->
//            System.out.println(number + state);
//            biConsumer1.accept("sleek","angel");
//        System.out.println(biConsumer.andThen(biConsumer1));

        Random random = new Random();
        Supplier<Integer> supplier = ()-> random.nextInt(100);
        System.out.println(supplier.get());

        Predicate<String> predicate = (name)->name.equals("Asake");
        System.out.println(predicate.test("Boyo"));

        BiPredicate<Integer,String> biPredicate = (num,word)-> String.valueOf(num).equals(word);
        System.out.println(biPredicate.test(5, "5"));

        Function<String, String> func = (word)-> new StringBuilder(word).reverse().toString();
        System.out.println(func.apply("Hello"));

        BiFunction<Integer,Integer,String> biFunction = (num1,num2)-> String.valueOf(num1*num2);
        System.out.println(biFunction.apply(2,4));

        UnaryOperator<Integer> unaryOperator = (num)-> num * num * num;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = (num1,num2)-> (num1*num2) + num2;
        System.out.println(binaryOperator.apply(5,7));
    }
}
