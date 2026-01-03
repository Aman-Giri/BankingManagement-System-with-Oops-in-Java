package Service;

import java.util.*;
import Model.Account;
import Model.CurrentAccount;
import Model.SavingAccount;

public class BankService {
    private Map<Integer, Account> accounts = new LinkedHashMap<>();

    public void createSavingAccount(int accno, String name, double balance){
        accounts.put(accno, new SavingAccount(accno,name,balance));
        System.out.println("Saving Account created");
    }

    public void createCurrentAccount(int accno,String name, double balance){
        accounts.put(accno,new CurrentAccount(accno,name,balance));
        System.out.println("Current Account Created");
    }

    public void deposite(int accNo, double amount){
        Account acc = accounts.get(accNo);
        if(acc != null){
            acc.deposit(amount);
        }else{
            System.out.println("Account not found");
        }
    }

    public void withdraw(int accNo, double amount){
        Account acc = accounts.get(accNo);
        if(acc != null){
            acc.withdraw(amount);
        }else{
            System.out.println("Account not found");
        }
    }

    public void displayAccount(int accNo){
        Account acc = accounts.get(accNo);
        if(acc != null){
            acc.displayAccount();
        }else{
            System.out.println("Account not found");
        }
    }

    public void checkBalance(int accNo){
        Account acc = accounts.get(accNo);
        if(acc != null){
            acc.getBalance();
        }else{
            System.out.println("Account not found");
        }
    }
}
