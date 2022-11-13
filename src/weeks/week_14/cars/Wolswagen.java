package weeks.week_14.cars;

public class Wolswagen {
    protected String brand;
    protected int wheels;
    protected int airBag;
    protected String color;
    protected int year;

    public Wolswagen(){
        this("default",4,5,"black",2022);
    }

    public Wolswagen(String brand, int wheels, int airBag, String color, int year) {
        this.brand = brand;
        this.wheels = wheels;
        this.airBag = airBag;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getAirBag() {
        return airBag;
    }

    public void setAirBag(int airBag) {
        this.airBag = airBag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String toString(){
        return "Brand : " + brand + " \n" + "Wheels :" + wheels + "\n Air bag : "+ airBag + "\nColor : "+ color + "\nYear : "+ year;
    }
}
