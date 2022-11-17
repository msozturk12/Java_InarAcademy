package chapters.chapter11.Exercises11.Exercise11_08;

import java.util.ArrayList;

public class Account11Test {
    public static void main(String[] args) {

        Account11 account = new Account11(1122,1000,1.5,"George");
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

       // System.out.println(account);
        System.out.println("----------------------------------------------");
        ArrayList<Transaction>transactions=account.getTransaction();
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i).toString());

        }



    }
}
