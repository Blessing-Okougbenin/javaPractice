package Chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SalesCommission {
//Develop a Java application that inputs one salesperson’s items sold
//for last week and calculates and displays that salesperson’s earnings.
//There’s no limit to the number of items that can be sold.

    private static final Scanner scanner = new Scanner(System.in);
    private static final int salary = 200;
    private static final double commissionPercent = 0.09;
    private static ArrayList<Integer> items = new ArrayList<>();

    public static ArrayList<Integer> getItems() {
        return items;
    }

    public static void setItems(ArrayList<Integer> items) {
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        SalesCommission.items = items;
    }

    public static void displayItems(){
        setItems(items);
        System.out.println("These are the list of items" +
                " available for sales" + Arrays.toString(items.toArray()));
    }

    public static void salesOption(){
        System.out.println("Please choose an item to sell");
        int input = scanner.nextInt();
//        for (int i = 1; i <= 4 ; i++) {
//            System.out.println("Item 1 Price- 239.99");
//
//        }
             switch (input){
                case 1 ->{
                    System.out.println();
                    sale();
                    }
                case 2 -> {
                    System.out.println("Price- 129.75");
                    sale();
                }
                case 3 -> {
                    System.out.println("Price- 99.95");
                    sale();
                }
                case 4 -> {
                    System.out.println("Price- 350.89");
                    sale();
                }
                default -> System.out.println("There are only 4 items available " +
                            "for sales");

            }





    }

    public static void sale(){
        System.out.println("Successfully sold");
    }

    public static void promptSalesPerson(){
        System.out.println("Please enter the items sold");
        int input2 = scanner.nextInt();
        switch (input2){
            case 1 -> System.out.println("Your payment is " + (salary + (239.99*commissionPercent)));
            case 2 -> System.out.println("Your payment is " + (salary + (129.75*commissionPercent)));
            case 3 -> System.out.println("Your payment is " + (salary + (99.95*commissionPercent)));
            case 4 -> System.out.println("Your payment is " + (salary + (350.89*commissionPercent)));
            default -> setItems(items);
        }
    }
}
