package Chapter7;

public class StudentGradeBook {
    private String courseName;
    private final int[][] grades;

    public StudentGradeBook(String courseName, int [][] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void processGrades(){
//        output grades array
        outputGrades();
//
//       call methods to get minimum and maximum
        System.out.printf("Maximum grade is :%d%nMinimum grade is :%d%n",
                getMaximum(), getMinimum()
        );
//        Print grade distribution chart
        outputBarChart();
    }

//    output the contents of the grades array
    private void outputGrades() {
        System.out.printf("The grades are: %n%n");
        System.out.print("             ");
//      create a column heading for each exam
        for (int exam = 0; exam < grades[0].length;exam++)
            System.out.printf("Exam %d  ", exam + 1);
        System.out.println("Average"); //student average column heading
//        create rows/columns of text representing array grades
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test:grades[student]) //        output each student's grade
                System.out.printf("%8d", test);
//            call method getAverage
//            pass row of grades as the argument to getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }


    }

    private void outputBarChart() {
        System.out.println("Grade distribution: ");
//        stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];
//        for each grade, increment the appropriate frequency
        for (int[] grade:grades) {
            for (int gradee:grade) {
                ++frequency[gradee / 10];
            }

        }
//        for each grade frequency, print bar chart
        for (int count = 0; count < frequency.length; count++) {
//            output bar label 00-09,10-19...
            if (count == 10) System.out.printf("%5d: ", 100);
            else System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

//            print bar of zeroes
            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println();

        }

    }

    private double getAverage(int[] setOfGrades) {
        int total = 0;
        for (int grade:setOfGrades) total += grade; // New total
        return (double) total / setOfGrades.length;
    }

    private int getMaximum() {
        int highGrade = grades[0][0]; // assume the first element is the highest
        for (int[] studentGrade: grades) {
            for(int grade:studentGrade) if(grade > highGrade) highGrade = grade; // new highest grade
        }
        return highGrade;
    }

    private int getMinimum() {
        int lowGrade = grades[0][0];//assume it's the first number
//        loop thru grades array
        for (int[] studentGrade:grades) {
            for (int grade:studentGrade)
                if(grade < lowGrade) lowGrade = grade; // new lowest grade
        }
        return lowGrade;
    }


}
