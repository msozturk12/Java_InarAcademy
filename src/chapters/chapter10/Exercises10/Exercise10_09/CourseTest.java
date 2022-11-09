package chapters.chapter10.Exercises10.Exercise10_09;

import java.sql.SQLOutput;

public class CourseTest {
    public static void main(String[] args) {
        Course c1 = new Course("Inar Academy");
        c1.addStudent("Deva");
        c1.addStudent("Bilal");
        c1.addStudent("Ercan");
        c1.addStudent("mes");
        c1.displayStudent();

        System.out.println("-----------------------------------------");

        c1.dropStudent("Deva");
        c1.displayStudent();

        System.out.println("-----------------------------------------");
        c1.clear();
        c1.displayStudent();


    }


}
