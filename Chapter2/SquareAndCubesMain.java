package Chapter2;

public class SquareAndCubesMain {
    public static void main(String[] args) {
        SquareAndCubes project1 = new SquareAndCubes();

        System.out.printf("%10s%10s%10s%n", "Number", "Square", "Cube");
        for (int i = 0; i <= 10; i++) {
            project1.setNumbers(i);
            System.out.printf("%10d%10d%10d%n",project1.getNumbers() ,project1.calculateSquare() ,project1.calculateCube());
        }
    }

}
