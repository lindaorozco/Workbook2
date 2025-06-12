package Week5.BankAccount;

public class CheckingsAccount extends BankAccount {

    public CheckingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }
    @Override
    public void withdraw(double amount){
        double transFee = 3.00;
        System.out.println(getBalance() - transFee - amount);
    }
}
