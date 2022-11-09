package chapters.chapter10.Exercises10.Exercise10_07;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
       this.id=0; //default values
       this.balance=0;
       this.annualInterestRate=0;

    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return ((getAnnualInterestRate() / 12)/100);

    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);

    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }
}
