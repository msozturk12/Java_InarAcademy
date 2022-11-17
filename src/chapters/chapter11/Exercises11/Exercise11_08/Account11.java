package chapters.chapter11.Exercises11.Exercise11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account11 {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    private String name;

    private ArrayList<Transaction> transaction= new ArrayList<>();


    public Account11() {
        this.id = 0; //default values
        this.balance = 0;
        this.annualInterestRate = 0;

    }

    public Account11(int id, double balance, double annualInterestRate, String name) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.name = name;
    }

    public Account11(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();

    }

    public Account11(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(ArrayList<Transaction> transaction) {
        this.transaction = transaction;
    }

    public double getMonthlyInterestRate() {
        return ((getAnnualInterestRate() / 12) / 100);

    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }


    public void withdraw(double amount) {
        balance=balance-amount;
        Transaction t = new Transaction('W', amount, balance, "say sth",new Date());
        transaction.add(t);

    }

    public void deposit(double amount) {
        balance = balance+amount;
        Transaction t = new Transaction('D', amount, balance, "say sth",new Date());
        transaction.add(t);
    }

    @Override
    public String toString() {

        return "\nAccount11:" +
                "\nname:" + name +
                "\nid=" + id +
                "\nbalance=" + balance +
                "\nannualInterestRate=" + annualInterestRate +
                "\ndateCreated=" + dateCreated +
                "\n\ntransaction=" + transaction ;

    }
}
