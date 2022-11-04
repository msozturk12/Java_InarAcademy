package chapters.chapter09.exercises09.Exercises09_13;

public class Location {
    public int row;
    public int column;
    public double maxValue;


    public Location() {
        this(0, 0, 0);//default values
    }

    public Location(int row, int column, double maxValue) {

        this.row = row;
        this.column = column;
        this.maxValue = maxValue;

    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public double getMaxValue() {
        return this.maxValue;
    }

    public void display() {
        System.out.printf("The location of the largest element is %.2f at (%d , %d)", getMaxValue(), getRow(), getColumn());
    }

}
