package chapters.chapter10.Listing10;

public class CourseTest {
    public static void main(String[] args) {
        Course c1 = new Course("Inar Academy");
        Course c2 = new Course("Cyber Security");

        c1.addStudent("Haluk");
        c1.addStudent("Berk");
        c1.addStudent("Hasan");
        System.out.println("The name of course " + c1.getCourseName());
        System.out.println("Number of student in course1: " + c1.getNumberOfStudent());
        String[] students = c1.getStudents();
        for (int i = 0; i < c1.getNumberOfStudent(); i++) {
            System.out.print(students[i] + ", ");

        }
        System.out.println("\n-----------------");

        c2.addStudent("Ilker");
        c2.addStudent("Hüseyin");
        System.out.println("The name of course " + c2.getCourseName());
        System.out.println("Number of student in course2: " + c2.getNumberOfStudent());

        String[] student1 = c2.getStudents();
        for (int i = 0; i <c2.getNumberOfStudent() ; i++) {
            System.out.print(student1[i] + " ,");

        }


    }


}

