package chapters.chapter11.Exercises11.Exercise11_03;

public class SavingAccount extends Account {

    public SavingAccount() {
        super();
    }

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() > amount ) {
            setBalance(getBalance() - amount);
            System.out.println("you withdraw $" + amount + " and your balance is $" + getBalance());
            System.out.println("--------------------------------------------------------------------");
        } else {
            System.out.println("you try to withdraw $" + amount + " but your balance is $" + getBalance());
            System.out.println("Your account is out of limit,you can't withdraw $" + amount);
            System.out.println("--------------------------------------------------------------------");
        }
    }

    @Override
    public String toString() {
        return "Class : SavingAccount\n" + "balance is= " +
                getBalance() + "\ndate created= " + getDateCreated();
    }
}
