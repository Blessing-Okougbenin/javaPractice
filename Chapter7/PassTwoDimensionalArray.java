package Chapter7;

import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] b = getArray();

        System.out.println("\nSum of all elements is  " + sum(b));
    }
//        int [][] array ={ {1,2,3,4},{5,6,7,8}};
//        System.out.println(Arrays.toString(m1(array[0])));
//        System.out.println(Arrays.toString(m1(array[1][0])));
//    }
//
//    private static int[][] m1(int[][] m) {
//        int [][] result = new int[2][2];
//        result [0][0] = m.length;
//        result [1][1] = m[0].length;
//
//        return result;
//    }

        public static int[][] getArray () {
            Scanner input = new Scanner(System.in);
            //Enter array values
            int[][] b = new int[3][4];
            System.out.println("Enter " + b.length + " rows and " + b[0].length + " columns: ");
            for (int i = 0; i < b.length; i++)
                for (int j = 0; j < b[i].length; j++)
                    b[i][j] = input.nextInt();
            return b;
        }
        public static int sum ( int[][] b){
            int total = 0;
            for (int[] ints : b) {
                for (int anInt : ints) {
                    total += anInt;
                }
            }
            return total;
        }
    }

