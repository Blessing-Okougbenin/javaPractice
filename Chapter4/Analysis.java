package Chapter4;

import java.util.Scanner;

public class Analysis {
    /*
1 Initialize passes to zero
2 Initialize failures to zero
3 Initialize student counter to one
4
5 While student counter is less than or equal to 10
6 Prompt the user to enter the next exam result
7 Input the next exam result
8
9 If the student passed
10 Add one to passes
11 Else
12 Add one to failures
13
14 Add one to student counter
15
16 Print the number of passes
17 Print the number of failures
18
19 If more than eight students passed
20 Print “Bonus to instructor
     */
    private  int passes = 0;
    private  int failures = 0;
    private static int counter = 1;
    Scanner scanner = new Scanner(System.in);

    public void analysis(){

        while (counter <= 10){

            System.out.println("Enter exam result(1--> Pass, 2--> Fail): ");
            int result = scanner.nextInt();
                if(result == 1) passes++;
                else if(result == 2) failures++;

            counter++;
        }
        System.out.println("The number of passes is: "+ passes);
        System.out.println("The number of failures is: "+ failures);

        if(passes > 8){
            System.out.println("Bonus to instructor!!");
        }
    }

    public static void main(String[] args) {
        Analysis analysis = new Analysis();
        analysis.analysis();
    }


}
