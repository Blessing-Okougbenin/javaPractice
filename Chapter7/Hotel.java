package Chapter7;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Hotel {

public static void main(String[] args) {
    mainMenu();


}

    private static void mainMenu() {
        String[] hotelRooms = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("          Welcome to Sleek hotels");
        System.out.println("               A home to all\n");

        System.out.println("""
                       PLEASE SELECT AN OPTION FROM THE MENU
                    
                     1.  BOOK A ROOM
                     2.  CHECK OUT OF YOUR ROOM
                     3.  CHECK DETAILS OF A ROOM
                     0.  Exit
                    """);

        int userAnswer = input.nextInt();
        switch (userAnswer) {
            case 1 -> selectRoom(hotelRooms, input);
            case 2 -> checkOutOfRoom(hotelRooms, input);
        }
    }









    private static void checkOutOfRoom(String[] hotelRooms, Scanner input) {
        System.out.println("Your room number,please?");
       int roomNumber = input.nextInt();
        switch (roomNumber) {
            case 1 -> {

                System.out.println(hotelRooms[0] + "You've been successfully checked out\n" + "Enter 0 to leave this page");
                int userAnswer1 = input.nextInt();
                if (userAnswer1 == 0) mainMenu();
            }
            case 2 ->  {
                System.out.println(hotelRooms[1] + "You've been successfully checked out\n" + "Enter 0 to leave this page");
                int userAnswer1 = input.nextInt();
                if (userAnswer1 == 0) mainMenu();
            }
            case 3 -> {
                System.out.println(hotelRooms[2] + "You've been successfully checked out\n" + "Enter 0 to leave this page");
                int userAnswer1 = input.nextInt();
                if (userAnswer1 == 0) mainMenu();
            }
        }

    }

    private static void selectRoom(String[] hotelRooms, Scanner input) {
        String hotelRoom1;
        String hotelRoom2;
        String hotelRoom3;
        String hotelRoom4;
        String hotelRoom5;
        System.out.println("1- LIST OF ROOMS");
        int listOfRooms = input.nextInt();
        if (listOfRooms == 1) {
            System.out.println("""
               WELCOME!
               Please choose your preferred room:
               """);
            System.out.println("""
                ROOM 1
                - King sized bed
                - A plasma TV
                - A jacuzzi
                --Price- $500
                - Un-booked
                """);
            System.out.println("""
                ROOM 2
                - Standard sized bed
                - A plasma TV
                - A hot tub
                --Price- $400
                - Un-booked
                """);
            System.out.println("""
                ROOM 3
                - Standard sized bed
                - A plasma TV
                --Price- $300
                - Booked
                """);
            System.out.println("""
                ROOM 4
                - Moderately sized bed
                - A plasma TV
                --Price- $200
                - Un-booked
                """);
            System.out.println("""
                ROOM 5
                - Small sized bed
                - A plasma TV
                --Price- $100
                - Un-booked
                """);

        }
        System.out.println("BOOK YOUR PREFERRED ROOM");
        int number = input.nextInt();

        switch (number) {

                case 1 -> {
                    try {
                        System.out.print("Please enter your name: ");
                        hotelRoom1 = input.next();
                        int password = (int) (Math.random() * 1000);
                        System.out.println(hotelRoom1 + " " + "You have successfully booked this room\n" + "This is your password- " + hotelRoom1 + password + "\n");
                        System.out.println("Enter 0 to exit this page");
                        int changeSelection = input.nextInt();
                        if (changeSelection == 0) {
                            mainMenu();
                        }
                    }
                    catch (InputMismatchException ex) {
                        System.out.println("Invalid input");
                        mainMenu();
                    }


                }

            case 2 -> {
                System.out.print("Please enter your name: ");
                hotelRoom2 = input.next();
                int password = (int) (Math.random() * 100);
                System.out.println(hotelRoom2 + " " + "You have successfully booked this room\n" + "This is your password- " + hotelRoom2 + password + "\n");
                System.out.println("Enter 0 to exit this page");
                int changeSelection = input.nextInt();
                if (changeSelection == 0) {
                    selectRoom(hotelRooms, input);
                }

            }
            case 3-> {
                System.out.print("Please enter your name: ");
                hotelRoom3 = input.next();
                System.out.println(hotelRoom3 + " " + "You have unsuccessfully booked this room\n"  + "It has already being booked");
                System.out.println("To select a different room from the list of rooms, enter 0");
                int changeSelection = input.nextInt();
                if (changeSelection == 0) {
                    System.out.println("Select another room\n");
                    hotelRoom3 = hotelRooms[2];
                }
                selectRoom(hotelRooms, input);
            }
            case 4-> {
                System.out.print("Please enter your name: ");
                hotelRoom4 = input.next();
                int password = (int) (Math.random() * 100);
                System.out.println(hotelRoom4 + " " + "You have successfully booked this room\n" + "This is your password- " + hotelRoom4 + password + "\n");
                System.out.println("Enter 0 to exit this page");
                int changeSelection = input.nextInt();
                if (changeSelection == 0) {
                    selectRoom(hotelRooms, input);
                }

            }
            case 5-> {
                System.out.print("Please enter your name: ");
                hotelRoom5 = input.next();
                int password = (int) (Math.random() * 100);
                System.out.println(hotelRoom5 + " " + "You have successfully booked this room\n" + "This is your password- " + hotelRoom5 + password + "\n");
                System.out.println("Enter 0 to exit this page");
                int changeSelection = input.nextInt();
                if (changeSelection == 0) {
                    selectRoom(hotelRooms, input);
                }

            }
           case 0-> selectRoom(hotelRooms, input);
        }
    }


}
