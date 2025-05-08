package Week5.HotelApp;

public class Room {

    //instances
    private int numberOfBeds;
    private int price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;



    // create constructor
    public Room(int numberOfBeds, int price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }
    // Exercise 2
    public void checkIn(){
        setOccupied(true);
        setDirty(true);
    }
    public void checkOut(){
        setOccupied(false);
        cleanRoom();

    }
    public void cleanRoom(){
        setDirty(false);

    }
    // create getters and setters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return (!isDirty() && !isOccupied());
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }







}