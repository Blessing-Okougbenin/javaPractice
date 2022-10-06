package Chapter4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindromes {
    /*
    A palindrome is a sequence of characters that reads the same
    backward as forward. For example, each of the following five-digit integers
    is a palindrome: 12321, 55555, 45554
    and 11611. Write an application that reads in a five-digit integer and
    determines whether it’s a palindrome. If the number is not five digits long,
    display an error message and allow the user to enter
    a new value.
     */
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
        String message = """
                THIS APPLICATION TAKES IN A SET OF INTEGERS AND DETERMINES IF
                IT IS A PALINDROME
                YOU HAVE THE LIBERTY TO RUN THIS FOR FIVE TIMES.             
                """;
        System.out.println(message);
        promptForReply();
    }

    private static void promptForReply() throws InputMismatchException {
        int count = 1;

        while (count <= 5) {
            System.out.println("Please input a five-digit long integer: ");
            String numbers = input.nextLine();
            int length = numbers.length();
            if (length > 5) {
                System.out.println("ERROR: Input mismatch!!!");
                promptForReply();
            }
            char letter;
            String reversedWord = "";
            for (int i = 0; i < numbers.length(); i++) {

                letter = numbers.charAt(i);
                reversedWord = letter + reversedWord;
            }

            System.out.println(reversedWord);

            if (reversedWord.equals(numbers)) {
                System.out.println("This is a palindrome");
            } else System.out.println("This is not a palindrome");


            count++;
        }

    }

}
