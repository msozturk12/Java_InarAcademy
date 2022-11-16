package chapters.chapter11.Exercises11.Exercise11_05;

public class Course1Test {
    public static void main(String[] args) {
        Course1 c1 = new Course1("Inar");

        c1.addStudent("Ahmet");
        c1.addStudent("Umut");
        c1.addStudent("Kral");
        c1.addStudent("Haluk");
        c1.addStudent("Antoine");

        String[] students = c1.getStudents();
        displayArr(students);
        System.out.println("\nNumber of student--> " + c1.getNumberOfStudent());
        System.out.println("------------------------------------------");

        c1.dropStudent("Antoine");
        c1.dropStudent("Haluk");
        students = c1.getStudents();
        System.out.println("After remove(Antoine and Haluk) :");
        displayArr(students);
        System.out.println("\nNumber of student--> " + c1.getNumberOfStudent());


    }

    private static void displayArr(String[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
    }
}
