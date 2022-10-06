package Chapter7;

public class InitArray {
    public static void main(String[] args) {
        int [][] array1 = {{1,2,3}, {4,5,6}};
        int [][] array2 = {{1,2}, {3}, {4,5,6}};
        System.out.println("Values in array1 by row are");
        outputArray(array1); // displays array1 by row
        
        System.out.println("Values in array2 by row are");
        outputArray(array2); // displays array1 by row
    }
    //    output rows and columns of a two-dimensional array
    private static void outputArray(int[][] array) {
//        loop thru columns of curent row
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }

    }

    
}
