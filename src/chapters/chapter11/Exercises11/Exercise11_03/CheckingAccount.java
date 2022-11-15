package chapters.chapter11.Exercises11.Exercise11_03;

public class CheckingAccount extends Account {

    protected double overDraftLimit;

    CheckingAccount() {
        this.overDraftLimit=-1000;

    }

    CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;

    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
@Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= getOverDraftLimit()) {
            setBalance(getBalance() - amount);
            System.out.println("You withdraw $" + amount + "your balance is $" + getBalance());
            System.out.println("---------------------------------------------------------------");

        } else {
            System.out.println("you withdraw $" + amount +
                    "\nyour overdraft limit is $" + getOverDraftLimit()+ "\nyour balance is $" + getBalance() +
                    "\nThe largest money that you can withdraw $" + ( getBalance() - (getOverDraftLimit())));
            System.out.println("Out of Limit!!!");
            System.out.println("------------------------------------------------");
        }
    }

    @Override
    public String toString() {
        return "Class : CheckingAccount\nOverDraftLimit=" + overDraftLimit+
                "\nbalance is= " + getBalance() + "\ndate created= " + getDateCreated();
    }
}
