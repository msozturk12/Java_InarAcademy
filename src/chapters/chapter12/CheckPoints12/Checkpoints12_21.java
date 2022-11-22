package chapters.chapter12.CheckPoints12;

public class Checkpoints12_21 {

    /*
Suppose that statement2 causes an exception in the following statement:

        try {
    statement1;
    statement2;
    statement3;
    }
    catch (Exception1 ex1) {
    }
    finally {
    statement4;
    }
    statement5;

    -If no exception occurs, will statement4 be executed, and will statement5 be executed? -yes -yes
    -If the exception is of type Exception1, will statement4 be executed, and will statement5 be executed? -yes -yes
    -If the exception is not of type Exception1, will statement4 be executed, and will statement5 be executed?-yes -no

     */
}
