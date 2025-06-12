package Week5.ShoppingCartSystem;

public class Main {
    public static void main(String[] args) {
    Product product = new Product("apple" , 5.99);
    Product product1 = new Product("Pear", 2.99);


    DiscountedProduct dp = new DiscountedProduct("strawberry", 4, 10);
    DiscountedProduct dp1 = new DiscountedProduct("Nuts", 5, 15);

      ShoppingCart shoppingCart = new ShoppingCart();

      shoppingCart.addItem(product);
      shoppingCart.addItem(product1);
      shoppingCart.addItem(dp);
      shoppingCart.addItem(dp1);


      shoppingCart.printReceipt();

    }
}
