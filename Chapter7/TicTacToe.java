package Chapter7;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.println("Welcome to myTic-Tac-Toe game");

        char [][] game = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};

        displayBoard(game);

        System.out.println("Enter placement between 1 - 9");
        int placement = input.nextInt();
        System.out.println(placement);
        playerPlacePiece(placement,"Player",game);

        Random number = new Random();
        int cpuPlacement = number.nextInt(9) + 1;

        playerPlacePiece(cpuPlacement,"CPU",game);
        displayBoard(game);
        
        
    }





    private static void playerPlacePiece(int placementPos, String user, char[][] game) {
        char symbol =' ';
       if (user.equals("Player")) {
           symbol = 'x';
       } else if (user.equals("CPU")) {
           symbol = 'o';
       }
        switch (placementPos) {
            case 1 : game[0][0] = symbol;
            case 2 : game[0][1] = symbol;
            case 3 : game[0][2] = symbol;
            case 4 : game[1][0] = symbol;
            case 5 : game[1][1] = symbol;
            case 6 : game[1][2] = symbol;
            case 7 : game[2][0] = symbol;
            case 8 : game[2][1] = symbol;
            case 9 : game[2][2] = symbol;
            default :
                break;
        }
    }

    private static void displayBoard(char[][] game) {
        for (char [] row : game) {
            System.out.println(row);
        }
    }


}