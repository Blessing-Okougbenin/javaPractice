package Chapter15;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) {
        try (PrintWriter printWriter =
                     new PrintWriter("C:\\Users\\user\\IdeaProjects\\dietelExercises\\src\\Chapter15\\test.txt")){

            printWriter.println("Oma is a princess");
            printWriter.append("House it");

//            printWriter.flush();
//              printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
