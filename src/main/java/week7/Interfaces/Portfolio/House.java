package week7.Interfaces.Portfolio;

public class House extends FixedAsset {

    private int yearBuilt;
    private int sqFt;
    private int bedRooms;

    public House(String name, double marketValue, int yearBuilt, int sqFt, int bedRooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.sqFt = sqFt;
        this.bedRooms = bedRooms;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }
}
