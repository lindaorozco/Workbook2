package week2;

import java.util.Scanner;

public class miniProject3 {
    public static void main(String[] args) {
   //1
        Scanner scanner = new Scanner(System.in);


        //Ask for the Bill Amount
        System.out.println("Enter the bill amount: ");

        //convert the string into a double by using Double.parseDouble()
        double bill = Double.parseDouble(scanner.nextLine());

        //  Ask for the Tip Percentage
        System.out.println("How much would you like to tip? ");

        //they will enter 10 for 10% and we need to parse into a double
        double tipAmt = Double.parseDouble(scanner.nextLine());

        // Calculate the Tip and Total
        // We convert the percentage to a decimal by dividing by 100
         double tip = bill * (tipAmt / 100);
         // Then we multiply it by the bill to get the tip, and add it to the bill for the total.
        double totalAmt = bill + tipAmt;

         // Round with Math.ceil() and Math.floor()
        //Math.ceil() rounds up to the next whole number (e.g. 12.1 → 13.0)
        double roundUp = Math.ceil(totalAmt);
        // Math.floor() rounds down (e.g. 12.9 → 12.0)
        double roundDown = Math.floor(totalAmt);

        // Show all results
        System.out.println("Tip amount is: "+ tipAmt);
        System.out.println("Total amount is: "+ totalAmt);
        System.out.println("Tip rounded up is: "+ roundUp);
        System.out.println("Tip rounded down is: "+roundDown);

        }







    }


