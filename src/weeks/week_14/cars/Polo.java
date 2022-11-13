package weeks.week_14.cars;

public final class Polo extends Wolswagen {
    private String model;
    private int engine;


    public Polo(String brand, int wheels, int airBag, String color, int year, String model,int engine) {
        super(brand, wheels, airBag, color, year);
        this.model = model;
        this.engine = engine;
    }

    public Polo(String model, int engine) {
        this.model = model;
        this.engine = engine;
    }

    public Polo() {
        this(2000);
        this.model = "Polo";
    }

    public Polo(int engine) {
        this.model = "Polo";
        this.engine = engine;

    }


    final double getTax(double price) {
        return price * engine * year;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + " \n" + "Wheels :" + wheels + "\n Air bag : " + airBag + "\nColor : " + color + "\nYear : "
                + year + "\nmodel : " + model + "\nengine :" + engine;
    }
}
