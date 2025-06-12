package Week5.ShoppingCartSystem;

import java.lang.annotation.Native;

public class DiscountedProduct extends Product {

    private double discountPercentage;


    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public DiscountedProduct(String name, double price, double discountPercentage) {
        super(name, price);
        this.discountPercentage = discountPercentage;
    }
    @Override
    public double getFinalPrice(){

        return getPrice() * (getPrice() * discountPercentage / 100);

    }

}
