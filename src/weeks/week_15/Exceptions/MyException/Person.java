package weeks.week_15.Exceptions.MyException;

public class Person {

    public void drink(Coffee coffee) throws TooHotCoffeeException {
        if (coffee.getTemp() > 80) {
            TooHotCoffeeException hata = new TooHotCoffeeException();
            throw hata; // throws yazılmazsa burası hata verir checked çünkü
        } else if (coffee.getTemp() < 40) {
            throw new TooColdCoffeeException();
        } else {
            System.out.println("ı drink coffee");
        }

    }
}
