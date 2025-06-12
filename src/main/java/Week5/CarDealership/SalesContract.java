package Week5.CarDealership;

import java.util.Scanner;

public class SalesContract extends Contract{


    private double salesTaxAmount = 0.05;
    private double recordingFee = 100;
    private double processingFee; // ($295 for vehicles under $10,000 and $495 for all others
    private boolean financeChoice; // true if they want a loan

    public SalesContract(String date, String name, Vehicle vehicle, double recordingFee, double processingFee, boolean financeChoice) {
        super(date, name, vehicle);
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.financeChoice = financeChoice;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinanceChoice() {
        return financeChoice;
    }

    public void setFinanceChoice(boolean financeChoice) {
        this.financeChoice = financeChoice;
    }

    public boolean finance(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to finance? Y/N ");
        String choice = scanner.nextLine().trim().toUpperCase();
            switch (choice){
                case "Y":
                    financeChoice = true;
                    break;
                case "N":
                    financeChoice = false;
                    break;
                default:
            }
        return financeChoice;
    }

    @Override
    public double getTotalPrice(){
        // Get the price of the vehicle
        double vehiclePrice = getVehicle().getPrice();
        // calc sales price
        double salesTax = 0.05 * vehiclePrice;
        // cal with recording fee
        double recording = recordingFee; // set to 100

        // ($295 for vehicles under $10,000 and $495 for all
        processingFee = (vehiclePrice < 10000) ? 295 : 495;
        // '?' if (value = true) then 295 ':' if not then 495
        return vehiclePrice + salesTax + recording + processingFee ;
    }

    @Override
    public double getMonthlyPayment(){
        // • All loans are at 4.25% for 48 months if the price is $10,000 or more
        //• Otherwise they are at 5.25% for 24 month

        double interest = 0; // the loan interest rate (either 4.25% or 5.25%)
        int months = 0; // how many months the loan will last either 48 or 24

        if (!isFinanceChoice()){
            return 0;
        }
        if (getTotalPrice() >= 10000) {
            interest = 4.25;
            months = 48;

        } else if (getTotalPrice() < 10000){
            interest = 5.25;
            months =24;
        }
        // create an object with interest with math logic
        double interestAsDecimal = interest / 100;
        double totalPriceWithInterest = getTotalPrice() * (1 + interestAsDecimal);
        double monthlyPayment = totalPriceWithInterest / months;

        return monthlyPayment;
    }

}

