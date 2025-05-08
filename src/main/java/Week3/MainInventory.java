package Week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainInventory {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //readFromFile();
        productsList.add(new Product("Carrots", 12,9.99));
        System.out.println(productsList);
        productsList.add(createProduct());
        System.out.println(productsList);
       // System.out.println(createProduct());



        // Connect the class
                //name of class



//            productsList.add(new Product("Apple", 2,  2.99));
//            productsList.add(new Product("Banana", 2, 0.20));
//            productsList.add(new Product("Milk ", 1, 5.00));
//            productsList.add(new Product("Walnuts", 4,  0.21));
//            productsList.add(new Product("Eggs", 3, 0.19));
//
//
//            // print each product
//            for ( Product product : productsList) {
//                System.out.println(product);
//            }

        }
    public static Product createProduct() {
        System.out.println("What's the name of the product?");
        String nameOfItem = scanner.nextLine();
        System.out.println("How many?");
        int numOfQuantity = scanner.nextInt();
        System.out.println("What price do you want to set?");
        double setPrice = scanner.nextDouble();
        return new Product(nameOfItem, numOfQuantity, setPrice);
    }

    public static void readFromFile(){
        try (BufferedReader br = new BufferedReader(new FileReader("Week3/ProductList.txt"))){
            String line;

            while ((line = br.readLine())!= null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Oh noo" + e.getMessage());
        }


    }
}


