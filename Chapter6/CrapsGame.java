package Chapter6;


import java.security.SecureRandom;

public class CrapsGame {
    private  static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status {CONTINUE, WON, LOST}
    //Enum type that represent the game status
    //constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARDS = 12;

    //plays one game of craps
    public static void main(String[] args) {
        int myPoint = 0; //point if no win or loss on first roll
        Status gameStatus;
        int sumOfDice = rollDice(); // first roll of the dice
        //determine game status and point based on first roll
        switch (sumOfDice) { //Win with 7 on first roll
            case SEVEN, YO_LEVEN -> //Win with 11 on first roll
                    gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARDS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
            }
        }
//While game is not complete
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumOfDice == SEVEN) {
                gameStatus = Status.LOST;
            }

        }

        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }
     }




    private static int rollDice() {
        //pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

         int sum = die1 + die2; // sum of die values

         // display results of this roll
         System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
         return  sum;
    }
 }
