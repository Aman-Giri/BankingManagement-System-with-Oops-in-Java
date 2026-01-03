package Model;

public abstract class Account {
    protected int accountnumber;
    protected String customerName;
    protected double balance;

    public Account(int accountnumber, String customerName, double balance){
        this.accountnumber = accountnumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount){
        if(amount >0){
            balance = balance+amount;
            System.out.println("Amount deposite successfully");
        }else{
            System.out.println("Invalid deposite amount");
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountnumber(){
        return accountnumber;
    }

    public void displayAccount(){
        System.out.println("Account no: " + accountnumber);
        System.out.println(("Customer Name: " + customerName));
        System.out.println("Balance" +  balance);
    }

}
