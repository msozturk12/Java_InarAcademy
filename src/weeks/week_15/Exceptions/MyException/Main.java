package weeks.week_15.Exceptions.MyException;

public class Main {
    public static void main(String[] args) throws TooHotCoffeeException {
        Person person = new Person();
        System.err.println("THIS IS RED WARNING ");
        Coffee turCaffe= new Coffee("Turk Kahvesi",122);

        person.drink(turCaffe);
    }
}
