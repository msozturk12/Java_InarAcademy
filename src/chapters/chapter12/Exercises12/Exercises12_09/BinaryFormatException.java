package chapters.chapter12.Exercises12.Exercises12_09;

public class BinaryFormatException extends Exception {
    public BinaryFormatException() {
        super("this is not a binary number!!");
    }

    public BinaryFormatException(String message) {
        super(message);
    }
}
