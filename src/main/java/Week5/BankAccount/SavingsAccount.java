package Week5.BankAccount;

public class SavingsAccount extends BankAccount{
    private int maxWithdrawl = 2;
    private int currentWithdrawl = 1;
    double earnInterest = 0.1;

    public SavingsAccount(String accountHolder, double balance, int maxWithdrawl, int currentWithdrawl) {
        super(accountHolder, balance);
    }
    @Override
    public void withdraw(double amount){
        if (maxWithdrawl >= currentWithdrawl){
            setBalance(getBalance() - amount);
        }

    }

    public void addedInterest (){
        setBalance(getBalance() * (1 + earnInterest));
    }
}
