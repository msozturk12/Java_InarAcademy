package chapters.chapter11.Exercises11.Exercise11_05;

import java.util.ArrayList;

public class Course1 {
    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudent;

    public Course1(){

    }

    public Course1(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String[] getStudents() {
        String[] result = new String[students.size()];
        for (int i = 0; i < students.size(); i++) {
            result[i] = students.get(i);

        }
        return result;
    }


    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }

    public void addStudent(String studentName) {
        students.add(studentName);
        numberOfStudent++;
    }

    public void dropStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            numberOfStudent--;

        } else {
            System.out.println("There is no student like " + studentName);
        }
    }
}
