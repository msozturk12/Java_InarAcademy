package chapters.chapter11.Listing11;

public class Facultyy extends Employeee {
    public static void main(String[] args) {
        new Facultyy();
    }

    public Facultyy() {
        System.out.println("(4) Performs Faculty's tasks");

    }
}

class Employeee extends Person {
    public Employeee() {
        this("(2)Invoke Employee's overloaded constructor");
        System.out.println("(3)Performs Employee's tasks ");
    }

    public Employeee(String s) {
        System.out.println(s);
    }
}

class Person {
    public Person() {
        System.out.println("(1)Performs Person's tasks");
    }
}