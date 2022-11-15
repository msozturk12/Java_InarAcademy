package chapters.chapter11.Exercises11.Exercise11_02;

public class Student extends Person {

    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    private int classStatus;


    public Student(String name, String address, String phoneNumber, String emailAddress, int classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    public int getClassStatus(){
        return this.classStatus;
    }
    public String toString(){
        return "Class name:Student " + "\nPerson's name: " +getName() + " \n";
    }
}
