package weeks.week_15.Exceptions;

import java.io.IOException;

public class Exception {
    public static void main(String[] args) {


        // RunTimeException is an UNCHECKED exception
        //  throw new RuntimeException("This is runtime exception by ınar");//check edilmemiş exc
        //**All the other exceptions (excluding Runtime Exception's subclasses) are CHECKED exception


        try {
            ioException();

        } catch (IOException e) {
            System.out.println("The IO EXCEPTION is handled/caught");

        }


        runTimeException();

    }

    private static void ioException() throws IOException {
        throw new IOException();
    }

    private static void runTimeException() throws RuntimeException {
        System.out.println("This app throws runtime exception");
        throw new RuntimeException();
    }

}
