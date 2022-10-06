package Chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        try {
            String userInput = reader.readLine();
            System.out.println("Line::::: " + userInput.toUpperCase());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
