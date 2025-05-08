package Week5.HotelApp;

public class Reservation {
    //create instances
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    // create constructor
    public Reservation(String roomType, int numberOfNights, boolean weekend) {

        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
        setPrice();
        setReservationTotal();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public void setPrice() {
        if (getRoomType().equalsIgnoreCase("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }
        if (isWeekend()){
            this.price *= 1.1; // this is 10% // *= will take the price as a starting point
        }
    }

    public double getPrice() {
        return price;
    }
    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal() {
        this.reservationTotal = getNumberOfNights() * getPrice();


    }

}
