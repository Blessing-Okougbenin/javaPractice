package Chapter4;

import java.util.Scanner;

public class TaxCalculator {
    private final Scanner scanner = new Scanner(System.in);
    public void taxCalc(){
        int count = 0;

        String display = """
                    Welcome!
                    Tax rate- 15%
                    Salary- 30,000 USD
                    
                    Tax rate- 20%
                    Salary- > 30,000 USD
                    """;
        System.out.println(display);
        while(count <= 3){
            System.out.println("Please input your name: ");
            String name = scanner.nextLine();
            System.out.println();

            System.out.println(name + ", Please input your salary amount");
            int salary = scanner.nextInt();

            double tax = salary + (0.15 * salary);

            if(salary <= 30000) System.out.println(name + ", Your tax is: " + tax);
            else {
                double tax2 = salary + (0.2 * salary);
                System.out.println(name + "Your tax is: " + tax2);
            }

            count++;
        }
    }

    public static void main(String[] args) {
        TaxCalculator calc = new TaxCalculator();
        calc.taxCalc();
    }
}
