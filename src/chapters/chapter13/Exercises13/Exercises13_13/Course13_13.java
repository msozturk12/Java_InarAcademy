package chapters.chapter13.Exercises13.Exercises13_13;

public class Course13_13 implements Cloneable {

    private String courseName;
    private String[] students;
    private int numberOfStudent;
    public static final int MAX_STUDENT = 60;

    public Course13_13(String courseName) {
        this.courseName = courseName;
        students = new String[MAX_STUDENT];
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
        if (numberOfStudent > MAX_STUDENT) {
            System.out.println("Course is full!!!");
        } else {
            students[numberOfStudent] = studentName;
        }
        numberOfStudent++;
    }

    public void dropStudent(String studentName) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(studentName)) {
                index = i;//index i oldu
                break;
            }
        }
        if (index == -1) {
            throw new RuntimeException("The student not found");
        }
        //student removed and sagdan sola kaydırılıo çıkan elemandan başlayarak
        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];

        }
        numberOfStudent--;
    }

    public Course13_13 clone() throws CloneNotSupportedException {
        Course13_13 courseClon = (Course13_13) super.clone();
        courseClon.students = students.clone();
        return courseClon;

    }

}
