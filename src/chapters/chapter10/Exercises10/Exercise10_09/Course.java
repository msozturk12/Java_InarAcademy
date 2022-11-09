package chapters.chapter10.Exercises10.Exercise10_09;

import weeks.week_12.student.Student;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudent;


    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[3];
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String[] getStudents() {
        return this.students;
    }

    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }

    public void addStudent(String studentName) {
        if (numberOfStudent >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }

        students[numberOfStudent] = studentName;
        numberOfStudent++;
    }

    public void dropStudent(String studentName) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(studentName)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Student is not found");

        }

        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];

        }
        numberOfStudent--;
    }

    public void clear() {
        students = new String[100];//new clear array
        numberOfStudent = 0;
    }

    public void displayStudent() {
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println(students[i] + " ");

        }

    }
}
