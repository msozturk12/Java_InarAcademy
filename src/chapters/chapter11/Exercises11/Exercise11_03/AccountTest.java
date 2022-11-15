package chapters.chapter11.Exercises11.Exercise11_03;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(4214,50_000);
        System.out.println(account.toString());
        System.out.println("--------------------------------");

        SavingAccount savingAccount=new SavingAccount(2112,20_000);
        savingAccount.withdraw(30_000);
        System.out.println(savingAccount.toString());
        System.out.println("-----------------------------------------------------------");


        CheckingAccount checkingAccount = new CheckingAccount(4220,5000,-2000);
        checkingAccount.withdraw(7500);
        System.out.println(checkingAccount.toString());
    }

}
