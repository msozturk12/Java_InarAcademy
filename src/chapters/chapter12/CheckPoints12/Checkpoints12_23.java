package chapters.chapter12.CheckPoints12;

public class Checkpoints12_23 {
    /*
             Suppose that statement2 causes an exception in the following statement:
            try {
            statement1;
            statement2;
            statement3;
            }
            catch (Exception1 ex1) {
            }
            catch (Exception2 ex2) {
            throw ex2;
            }
            finally {
            statement4;
            }
            statement5;

            -
■ If no exception occurs, will statement4 be executed, and will statement5 be executed?-->yes,yes

■ If the exception is of type Exception1, will statement4 be executed, and will statement5 be executed?yes,yes

■ If the exception is of type Exception2, will statement4 be executed, and will statement5 be executed?yes,no  it's rethrown

■ If the exception is not Exception1 nor Exception2, will statement4 be executed, and will statement5 be executed?  yes,no
     */
}
