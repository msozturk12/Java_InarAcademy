package chapters.chapter13.Exercises13.Exercises13_13;

public class Course13_13Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Course13_13 course1 = new Course13_13("Inar Academy");
        course1.addStudent("Antoine");
        course1.addStudent("Sare");
        course1.addStudent("Haluk");
        course1.addStudent("Berk");


        Course13_13 course2 = course1.clone();
        course2.addStudent("Ertuğrul");
        course2.addStudent("Razumihin");

        System.out.print("Course1 is:\n");
        displayArray(course1);
        System.out.println("--------------------------------------------------------");
        System.out.print("Clonned from course1 and added new students course2:\n");
        displayArray(course2);
    }

    private static void displayArray(Course13_13 course1) {
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudent(); i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();
    }
}
