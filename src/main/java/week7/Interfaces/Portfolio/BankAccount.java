package week7.Interfaces.Portfolio;

public class BankAccount implements Valuable {

    private String name;
    private String acctNr;
    private double balance;

    public BankAccount(String name, String acctNr, double balance) {
        this.name = name;
        this.acctNr = acctNr;
        this.balance = balance;
    }

    // implement two methods

    public double deposit (){

        return 0;
    }

    public double withdraw(){
        return 0;
    }

    @Override
    public double getValue() {
        return getValue();
    }
}
