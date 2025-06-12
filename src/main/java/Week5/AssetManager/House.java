package Week5.AssetManager;
//
//public class House extends Asset {
//
//    private String address;
//    private int condition; //(1 -excellent, 2 -good, 3 -fair, 4 -poor)
//    private int squareFoot;
//    private int lotSize;
//
//    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
//        super(description, dateAcquired,originalCost);
//        this.address = address;
//        this.condition = condition;
//        this.squareFoot = squareFoot;
//        this.lotSize = lotSize;
//    }

    // getValue() : double (override)
    // A house's value is determined as
// $180.00 per square foot (excellent)
// $130.00 per square foot (good)
// $90.00 per square foot (fair)
// $80.00 per square foot (poor)
// PLUS 25 cents per square foot of lot size

//    @Override
//    public double getValue() {
//        // create variable that will hold the method
//        double valuePerSqFt;
//
//        if (condition == 1) {
//            valuePerSqFt = 180;
//        } else if (condition == 2){
//            valuePerSqFt = 130;
//        }
//        else if (condition == 3){
//            valuePerSqFt = 90;
//        } else {
//        valuePerSqFt = 80;
//    } return (squareFoot * valuePerSqFt) + (lotSize * 0.25);



//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getCondition() {
//        return condition;
//    }
//
//    public void setCondition(int condition) {
//        this.condition = condition;
//    }
//
//    public int getSquareFoot() {
//        return squareFoot;
//    }
//
//    public void setSquareFoot(int squareFoot) {
//        this.squareFoot = squareFoot;
//    }
//
//    public int getLotSize() {
//        return lotSize;
//    }
//
//    public void setLotSize(int lotSize) {
//        this.lotSize = lotSize;
//    }
//}
