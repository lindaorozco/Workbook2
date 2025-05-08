package week2;

import java.util.Scanner;

public class AddressBuilder {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // create a string builder object

        StringBuilder billing = new StringBuilder();

        // prompt for billing address
        System.out.println("Please enter your full name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your full address: \n1, Street \n2. City \n3. State \n4. Zipcode \4");

        // append strings to the Stringbuilder object
        billing.append("Name ");
        billing.append("Address: ");
        System.out.println("Address");
        billing.append("Street: ");
        billing.append("City: ");
        billing.append("State: ");
        billing.append("Zipcode: ");


        // print out everything
        System.out.println(billing);



    }
}
