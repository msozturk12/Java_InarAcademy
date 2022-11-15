package chapters.chapter11.Exercises11.Exercise11_02;

public class Faculty extends Employee {


    protected int hours;
    protected String rank;


    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, int hours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.hours = hours;
        this.rank = rank;
    }

    public int getHours() {
        return hours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Class name: Faculty " + "\nPerson's name:" + getName()+ "\n";
    }
}
