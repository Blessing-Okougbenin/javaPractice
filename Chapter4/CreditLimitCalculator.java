package Chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    private String acctNumber = "23454321";
    private int firstBalance = 2000;
    private final int creditLimit = 5000;

    private Scanner scanner = new Scanner(System.in);
    public void getNewBalance(){
        System.out.println("Your Initial Account balance is: " + firstBalance);
        System.out.println("Input the charges on all your items this month :");

        int charges = scanner.nextInt();
        System.out.println("Input the total credits applied to your account this month :");
        int credits = scanner.nextInt();

        int newBalance = firstBalance + charges - credits;
        System.out.println(newBalance);

        if(newBalance > creditLimit) System.out.println("Account number: "+ acctNumber +", Your Credit limit Has Been Exceeded!");
        else System.out.println("Account number: "+ acctNumber +",your new balance is " + newBalance);

    }

    public static void main(String[] args) {
        CreditLimitCalculator calc = new CreditLimitCalculator();
        calc.getNewBalance();
    }

}
