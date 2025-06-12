package Week5.CarDealership;

public abstract class Contract {
    private String date;
    private String name;
    private Vehicle vehicle;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String date, String name, Vehicle vehicle) {
        this.date = date;
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract double getTotalPrice();
    //will return computed values based on contract type.

    public abstract double getMonthlyPayment();

}
