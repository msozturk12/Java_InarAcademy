package chapters.chapter09.exercises09.Exercises09_07;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20_000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Account's id is --> "+ account.getId() + " \nBalance is--> " + account.getBalance() +
                "\nMontly ınterest is --> " + account.getMonthlyInterest() +
                "\nDate that this account created --> " + account.getDateCreated());
    }
}
