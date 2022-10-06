package Chapter2;

public class SquareAndCubes {
     private int numbers;

    public void setNumbers(int numbers) {

        if (numbers >= 0 && numbers <= 10) {

            this.numbers = numbers;
        }
    }

    public int getNumbers() {
        return numbers;
    }

    public int calculateSquare() {
        return numbers * numbers;
    }

    public int calculateCube() {
        return numbers * numbers * numbers;
    }
}
