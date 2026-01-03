package View;

import Service.BankService;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        while(true){
            System.out.println("----Banking Menu------");
            System.out.println("1. Create Saving Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. View Account");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    bank.createSavingAccount(sc.nextInt(),sc.next(),sc.nextDouble());
                    break;
                case 2:
                    bank.createCurrentAccount(sc.nextInt(), sc.next(), sc.nextDouble());
                    break;
                case 3:
                    bank.deposite(sc.nextInt(), sc.nextDouble());
                    break;
                case 4:
                    bank.withdraw(sc.nextInt(),sc.nextDouble());
                    break;
                case 5:
                    bank.checkBalance(sc.nextInt());
                    break;
                case 6:
                    bank.displayAccount((sc.nextInt()));
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
