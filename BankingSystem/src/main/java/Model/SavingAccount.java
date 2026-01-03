package Model;

public class SavingAccount extends Account{

    //Keynote: why we have used static keyword here
    private static final double MIN_BALANCE = 1000;

    public SavingAccount(int accountNumber, String customerName, double balance){
        super(accountNumber,customerName,balance);
    }

    @Override
    public void withdraw(double amount) {
        if(balance-amount >= MIN_BALANCE){
            balance = balance-amount;
            System.out.println("Withrawal Succesfull");
        }else{
            System.out.println("Minimum Balance of 1000 must be maintained");
        }
    }
}
