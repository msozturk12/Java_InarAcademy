package chapters.chapter10.Exercises10.Exercise10_07;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] account = getAccounts(10);
        Atm(account, input);

    }

    public static void Atm(Account[] account, Scanner input) {
        int choise = 0;
        while (true) {
            int id = getIdFromUser();

            do {
                displayMainMenu();
                System.out.println("Enter a choise");
                choise = input.nextInt();
                switch (choise) {
                    case 1:
                        getDisplayBalance(account[id]);
                        System.out.println();
                        break;
                    case 2:
                        account[id].withdraw(getWithdrawAmount(account[id]));
                        break;
                    case 3:
                        account[id].deposit(getDepositAmount(account[id]));
                        break;
                    case 4:
                        break;
                    default:
                        do {
                            System.out.println("Invalid choise please enter a number(1-2-3-4)");
                            choise = input.nextInt();
                        } while (choise > 4 || choise <= 0);
                }

            } while (choise != 4);
        }

    }

    public static double getDepositAmount(Account account) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount to deposit: $");
        double deposit = input.nextDouble();
        return deposit;
    }

    public static double getWithdrawAmount(Account account) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount to withdraw: $");
        double withdraw = input.nextDouble();
        return withdraw;
    }

    public static void getDisplayBalance(Account account) {
        System.out.println("The balance is $" + account.getBalance());
    }

    public static Account[] getAccounts(int num) {
        Account[] accounts = new Account[num];
        for (int i = 0; i < num; i++) {
            accounts[i] = new Account(i, 100);

        }
        return accounts;
    }

    public static void displayMainMenu() {
        System.out.println("Main Menu ");
        System.out.println("1: check balance ");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");

    }

    public static int getIdFromUser() {
        Scanner input = new Scanner(System.in);
        int id = 0;
        do {
            System.out.println("Enter an id: ");
            id = input.nextInt();
            if (id < 0 || id > 10) {
                System.out.println("Enter a correct id");
            }
        } while ((id < 0 || id > 10));
        return id;
    }

}
