package Chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {
    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Integer> Numbers = new ArrayList<>();

    public void getMax(){
        int max = 0;
        int counter;

        System.out.println("Please enter 10 numbers: ");

        for(counter=0; counter <= 9; counter++) {

            System.out.printf("%d--->", counter);
            Numbers.add(scanner.nextInt());

            if (Numbers.get(counter) > max) {
                max = Numbers.get(counter);
            }
        }
        System.out.println(Numbers);
        System.out.println("The largest number is: "+ max);
    }

    public static void main(String[] args) {
            LargestNumber largestNumber = new LargestNumber();
            largestNumber.getMax();

    }
}
