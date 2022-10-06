package Chapter2;

public class PyramidOfGiza {
    private final int numberOfStones;
    private final int weightOfEachStone;
    private final int numberOfYears;
    private int result2;
    public PyramidOfGiza(int numberOfStones, int weightOfEachStone, int numberOfYears) {
           this.numberOfStones = numberOfStones;
           this.weightOfEachStone = weightOfEachStone;
           this.numberOfYears = numberOfYears;

    }

    public int weightPerYear() {
        int total = numberOfStones * weightOfEachStone;

        return total / numberOfYears;
    }

    public int weightPerHour() {

        return result2 / 24;
    }
}
