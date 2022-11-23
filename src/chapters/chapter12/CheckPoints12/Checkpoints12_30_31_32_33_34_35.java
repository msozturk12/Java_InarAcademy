package chapters.chapter12.CheckPoints12;

import java.io.PrintWriter;

public class Checkpoints12_30_31_32_33_34_35 {
    /*
    Checkpoints12_30-->
        -PrintWrite output = new PrintWrite(filename)
          -What is the reason to declare throws Exception in the main method in Listing 12.13, Listing_12_13WriteData.java?-->
            -The statement may throw an exception.Java forces us to deal with exception.
         - If the close() method is not invoked, the data may not be saved properly.

    Checkpoints12_31-->
     */


    public static void main(String[] args) throws Exception {
        PrintWriter output = new PrintWriter("C:\\Users\\mesut\\Desktop\\deneme\\temp1.txt");

        output.printf("amount is %f %e\r\n", 32.32, 32.32); // amount is 32,320000 3,232000e+01
        output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);//amount is 32,3200 3,2320e+01
        output.printf("%6b\r\n", (1 > 2)); // false
        output.printf("%6s\r\n", "Java"); //Java

        output.close();
    }

    /*
    Checkpoints12_32-->
     */
    public static void main1(String[] args) throws Exception {

        try (
                PrintWriter output = new PrintWriter("C:\\Users\\mesut\\Desktop\\deneme\\temp1.txt");

        ) {
            output.printf("amount is %f %e\r\n", 32.32, 32.32); // amount is 32,320000 3,232000e+01
            output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);//amount is 32,3200 3,2320e+01
            output.printf("%6b\r\n", (1 > 2)); // false
            output.printf("%6s\r\n", "Java"); //Java
        }

    }

    /*
    Checkpoints12_33-->
        -Scanner input = new Scanner(New File(filename))
        -?What is the reason to define throws Exception in the main method in Listing 12.15, Listing_12_15ReadData.java?
           -->the statement may throw exception so we throws Exception to header
        -It is not necessary to close the input file (line 22), but it is a good practice to do so to release the resources occupied by the file.


 Checkpoints12_34-->
        -If you attempt to create a Scanner for a nonexistent file, an exception will occur
        -If you attempt to create a PrintWriter for an existing file, the contents of the existing file will be gone.

 Checkpoints12_35-->
        -No
        -the line seperators are different on all platforms,on Windows /r/n

     */


}
