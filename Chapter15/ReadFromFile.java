package Chapter15;

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) {
         try {
//             FileInputStream inputStream = new FileInputStream();
             FileReader fileReader = new FileReader("C:\\Users\\user\\IdeaProjects\\dietelExercises\\src\\Chapter15\\test.txt");
             BufferedReader reader = new BufferedReader(fileReader);
             String message = reader.readLine();
             System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
