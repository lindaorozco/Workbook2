package Week3;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExplained {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Divide two numbers with exception handling
        // Ask the user for two int numbers and divide them. Catch any exceptions.

        try {
            System.out.println("Input two numbers to divide ");
            int nr1 = scanner.nextInt();
            int nr2 = scanner.nextInt();

         int nrMs = nr1 / nr2;
            System.out.println(nrMs);
        } catch (ArithmeticException e){
           System.out.println("Try again. Input numbers only");
        }catch (NumberFormatException e){
            System.out.println("You cannot divide by zero!");
        }

        // String to int conversion Ask the user to input a number as a string.
        // Convert it with Integer.parseInt() and catch exceptions.

        // Step 1: ask the user to enter a number
        System.out.println("Input a number");
        String number = scanner.nextLine();

        try {
            // step 2: convert the string into an int

            int pasrsedNum = Integer.parseInt(number);

            // Step 3: IF SUCCESSFUL / print the number
            System.out.println("You entered: " + pasrsedNum);

            // If there's an error
        } catch(InputMismatchException e){
            System.out.println("That's not a valid number. Try again");

        }

        // 3. Get age input Ask the user to enter their age.
        // Repeat the question until they give a valid number.

        boolean validAge = (true);
        while (validAge) { // keep looping until validAge is true
            try {
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Please enter your age ");


            }catch (NumberFormatException e){

            }

            System.out.println(validAge);



        }








    }
}


