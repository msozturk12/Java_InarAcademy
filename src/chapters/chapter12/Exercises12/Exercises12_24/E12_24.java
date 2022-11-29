package chapters.chapter12.Exercises12.Exercises12_24;

import java.io.File;
import java.io.PrintWriter;

public class E12_24 {
    public static void main(String[] args) throws Exception{
        File file =new File("C:\\Users\\mesut\\Desktop\\deneme\\Salary1.txt");

        if(file.exists()){
            System.out.println("The file already exist");
            System.exit(0);
        }

        String[] ranks = {"assistance","associate","full"};

        try(
                PrintWriter output = new PrintWriter(file);

                ){
            for (int i = 1; i <=1000 ; i++) {
                int rank =(int)(Math.random()* ranks.length);
                double salary = getSalary(rank);
                output.printf("FirstName%d LastName%d %s %.2f\n",i,i,ranks[rank],salary);

            }
        }

    }

    private static double getSalary(int rank) {
        if(rank==1){
            return (int)(Math.random()*30_000) + 50_000;
        }else if(rank==2){
            return (int)(Math.random()*50_000) + 60_000;
        }else{
            return (int)(Math.random()*55_000) + 75_000;
        }

    }
}
