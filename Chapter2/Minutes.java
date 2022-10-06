package Chapter2;
import java.util.Scanner;
public class Minutes {


        public static void main(String[] args){
            Scanner samuel = new Scanner(System.in);
            System.out.println("Please,enter the number of minutes to be converted: ");
            int userInput = samuel.nextInt();

            if(userInput < 60){

                System.out.println("Invalid input");

            }

            if(userInput == 60){

                System.out.println("1 Hour");

            }

            if(userInput > 60 && userInput < 1440){
                int hour = userInput / 60;
                int minute = userInput % 60;
                System.out.printf("%dhour%dminute",hour,minute);
            }

            if(userInput == 1440){

                System.out.println("1 Day");

            }

            if(userInput > 1440 && userInput < 525600){

                int day = userInput/1440;
                int hour = userInput / 60;
                int minute = userInput % 60;
                System.out.printf("%dday%dhour%dminute",day,hour,minute);

            }

            if(userInput == 525600){

                System.out.println("1 Year");

            }

            if(userInput > 525600){

                int year = userInput/525600;
                int day = userInput/1440;
                int hour = userInput / 60;
                int minute = userInput % 60;
                System.out.printf("%dyear%dday%dhour%dminute",year,day,hour,minute);

            }







        }




}
