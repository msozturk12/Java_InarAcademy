package chapters.chapter11.Exercises11.Exercise11_02;

import java.util.Date;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;



    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;


    }

   public String getOffice(){
        return this.office;
   }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Class name:Employee " + "\nPerson's name: " + getName() +"\n";
    }
}
