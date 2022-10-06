package Chapter4;

public class Mystery3 {
    public static void main(String[] args) {
        int row = 3;

        while (row >= 1) {
            int column = 3;

            while (column >= 1) {
                System.out.print(row % 2 == 0 ? "X " : "O ");
                --column;
            } // end while loop
             --row;
            System.out.println();
            } // end while
        } // end main
// end class Mystery3
}
