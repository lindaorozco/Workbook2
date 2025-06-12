package Week5.CarDealership;

public class LeaseContract extends Contract{

       private double expectedEndingValue;
       private double leasingFee;

    public LeaseContract(String date, String name, Vehicle vehicle, double expectedEndingValue, double leasingFee) {
        super(date, name, vehicle);
        this.expectedEndingValue = expectedEndingValue;
        this.leasingFee = leasingFee;
    }

    @Override
    public double getTotalPrice() {
        // get the original price and / by 2
        double vehiclePrice = getVehicle().getPrice();
        expectedEndingValue = vehiclePrice * 0.5;
        // get lease fee of 7%
        leasingFee = vehiclePrice * 0.07;
        // return total price : ending value + lease fee
        return expectedEndingValue + leasingFee;
    }

    @Override
    public double getMonthlyPayment() {
        //  All leases are financed at 4.0% for 36 months
        double totalPriceWithInterest = getTotalPrice() * (1 + 4.0 /100 );
        return totalPriceWithInterest /36;
    }
}


