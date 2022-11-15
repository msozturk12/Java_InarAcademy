package chapters.chapter11.Exercises11.Exercise11_02;

public class Staff extends Employee {
    protected String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;

    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Class name:Staff" + "\nPerson's name: " + getName() + "\n";
    }
}
