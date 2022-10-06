package Chapter17.Streams;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,10)
                .filter((x)-> x%2 == 0)
                .map((int x)->  x * 3)
                .sum()
        );

        SecureRandom randomNumbers = new SecureRandom();
        System.out.println("Random numbers on separate lines: ");
        randomNumbers.ints(10,1,7)
                        .forEach(System.out::println);
        String numbers = randomNumbers.ints(10,1,7)
                                         .mapToObj(String::valueOf)
                                          .collect(Collectors.joining(" "));
        System.out.println("Random numbers on one line: " + numbers);

        int[] values = {3,10,6,1,4,8,2,5,9,7};

        System.out.print("Original values: ");
        System.out.println(
                IntStream.of(values)
//                        .average()
//                        .getAsDouble()
//                        .sum()
//                        .min()
//                        .getAsInt()
                        .mapToObj(String:: valueOf)
                        .collect(Collectors.joining(" "))

        );
        System.out.printf("%nCount:");
    }
}
