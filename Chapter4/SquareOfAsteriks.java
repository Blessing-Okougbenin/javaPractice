package Chapter4;

import java.util.Scanner;

public class SquareOfAsteriks {
    static Scanner userInput = new Scanner(System.in);
    static int side = 0;


    public static void main(String[] args) {
        prompt();
        displaySquare();
    }





    public static void prompt(){
        System.out.println("Please enter the size of the sides of the square between 1 and 20: ");
        side = userInput.nextInt();
        if(side < 1 || side > 20){
            System.out.println("Please input the right number :)");
            prompt();
        }
    }
    public static void displaySquare(){
        int i, j;

        for (i = 1; i <= side; i++)  // rows
        {
            for (j = 1; j <= side; j++) //column
            {
                if (i == 1 || i == side ||
                        j == 1 || j == side)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
