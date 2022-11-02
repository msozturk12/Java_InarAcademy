package weeks.week_12.student;

public class Student {

    private String name;
    private String surname;
    private int id;
    private String email;
    private static int studentCounter;//*

    public final String ACADEMY = "Inar Academy";

    public String publicAccessModifier;
    String defaultAccessModifier;//package private-default
    private String privateAccessModifier;
    protected String protectedAccessModifier;



    public Student() {
        this("", "", 0, "");

    }

    public Student(String name, String surname, int id, String email) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.email = email;
        studentCounter++;

    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {

        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getStudentCounter(){
        return studentCounter;
    }


    public void print() {
        System.out.println("-------------");
        System.out.println("name :" + this.name);
        System.out.println("surname :" + this.surname);
        System.out.println("id :" + this.id);
        System.out.println("email :" + this.email);
        System.out.println("--------------------------");
    }

    public void printDataField() {
        System.out.println("Name - Surname - ID - Email");
    }
}



