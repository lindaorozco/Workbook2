package Week5.ShoppingCartSystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private double taxRate = 21;
    private List<Product> items = new ArrayList<>();

    public List<Product> getItems() {
        return items;
    }

    public void addItem(Product product){
        items.add(product);
    }

    public void printReceipt(){

         double sumOfProducts = 0;

        for (Product product : items){
            if (product instanceof DiscountedProduct){
                // this prints out the discounted products
                System.out.println(product.getName() +" "+ product.getFinalPrice());
                sumOfProducts += product.getFinalPrice();
            } else {
                // this prints all products
                System.out.println(product.getName() +" "+ product.getFinalPrice());
                sumOfProducts += product.getFinalPrice();
            }
        }
        double finalTotalPrice = sumOfProducts + (sumOfProducts * taxRate / 100);

        System.out.printf("Total before tax is: %.2f%n", sumOfProducts);
        System.out.printf("Tax amount: %.2f%n", sumOfProducts * taxRate /100);
        System.out.printf("Total after tax: %.2f", finalTotalPrice);
    }
}
