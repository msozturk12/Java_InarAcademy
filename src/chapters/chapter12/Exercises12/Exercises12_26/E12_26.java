package chapters.chapter12.Exercises12.Exercises12_26;

import java.io.File;
import java.util.Scanner;

public class E12_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a directory name");
        String directoryName = input.nextLine();
        File file = new File(directoryName);

        if(file.exists()){
            System.out.println("Directory already exist");
            System.exit(0);
        }
        if(file.mkdirs()){
            System.out.println("Directory is created successfully");
        }else{
            System.out.println("Directory is not created");
        }
    }

}
