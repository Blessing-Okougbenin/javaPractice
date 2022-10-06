package Chapter4;

import java.util.Scanner;

public class BinaryToDecimal {
    private static long binaryNumber;
    static Scanner scanner = new Scanner(System.in);
    public static int convert() {
        System.out.println("Please input your binary number for conversion (1s & 0s): ");
        binaryNumber = scanner.nextLong();
        int decimalNumber = 0, i = 0;
        long remainder;

        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            decimalNumber = (int) (decimalNumber + remainder * Math.pow(2, i));
            i++;
            binaryNumber = binaryNumber /  10;
        }
        return decimalNumber;
    }

    private static void conversion(){
        System.out.println("Please input your binary number for conversion (1s & 0s): ");
        String binary = scanner.next();
        int decimal = Integer.parseInt(binary,2);
        System.out.println(binary+ ": --> "+ decimal );
    }


    public static void main(String[] args) {
        System.out.println(convert());
        conversion();
    }

}
