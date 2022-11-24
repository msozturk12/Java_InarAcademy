package chapters.chapter12.Exercises12.Exercises12_08;

public class HexFormatException extends NumberFormatException{

    public HexFormatException(){
        super("This is not a hex number");
    }
    public HexFormatException(String message){
        super(message);

    }
}
