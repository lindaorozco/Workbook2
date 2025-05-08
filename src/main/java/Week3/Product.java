package Week3;

public class Product {

    private String nameItem;
    private int quantity;
    private double price;

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Constructor
    public Product(String nameItem, int quantity, double price){
        this.nameItem = nameItem;
        this.quantity = quantity;
        this.price = price;

    }

    @Override
    public String toString() {
        return nameItem + "|" + quantity + "|" + price;
    }
}