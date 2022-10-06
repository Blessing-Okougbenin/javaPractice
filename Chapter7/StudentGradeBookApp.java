package Chapter7;

public class StudentGradeBookApp {
    public static void main(String[] args) {
//        Array of students grades
        int[][] grades = {{87,96,70},
                          {68,87,90},
                          {94,100,90},
                          {100,81,82},
                          {83,65,85},
                          {78,87,65},
                          {85,75,83},
                          {91,94,100},
                          {76,72,84},
                          {87,93,73}};
        StudentGradeBook myGradeBook = new StudentGradeBook("Physics", grades);
        System.out.printf("Welcome to the grade book for:%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
