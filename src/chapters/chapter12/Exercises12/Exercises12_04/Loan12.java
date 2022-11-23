package chapters.chapter12.Exercises12.Exercises12_04;

import java.util.Date;

public class Loan12 {
    private double annualInterestRate;
    private int numberOfYear;
    private double loanAmount;
    private Date loanDate;

    public Loan12() {
        this(2.5, 1, 1000);

    }

    public Loan12(double annualInterestRate, int numberOfYear, double loanAmount) {
        if(loanAmount<=0 || annualInterestRate<=0 || numberOfYear<=0){
            throw new IllegalArgumentException("Checkout your values, they must be higher than zero ");
        }
        this.annualInterestRate = annualInterestRate;
        this.numberOfYear = numberOfYear;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return this.loanDate;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYear * 12;
    }

    public void displayLoan() {
        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", this.loanDate.toString()
                , getMonthlyPayment(), getTotalPayment());
    }

    @Override
    public String toString() {
        return "Loan Class{" +
                "\nannualInterestRate=" + annualInterestRate +
                "\nnumberOfYear=" + numberOfYear +
                "\nloanAmount=" + loanAmount +
                "\nloanDate=" + loanDate +
                '}';
    }
}
