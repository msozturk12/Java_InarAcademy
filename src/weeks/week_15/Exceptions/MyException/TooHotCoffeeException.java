package weeks.week_15.Exceptions.MyException;

public class TooHotCoffeeException extends Exception{

    public TooHotCoffeeException(){
        super("this coffee is too hot");
    }
    public TooHotCoffeeException(String message){
        super(message);
    }

}
