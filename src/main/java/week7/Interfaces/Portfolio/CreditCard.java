package week7.Interfaces.Portfolio;

public class CreditCard implements Valuable {

    private String name;
    private String acctNr;
    private double balance;

    public CreditCard(String name, String acctNr, double balance) {
        this.name = name;
        this.acctNr = acctNr;
        this.balance = balance;
    }


    public void charge (double amount){

        balance += amount;
    }
    public void pay(double amount){

        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
