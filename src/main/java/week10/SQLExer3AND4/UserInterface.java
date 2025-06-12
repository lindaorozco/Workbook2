package week10.SQLExer3AND4;

import java.util.Scanner;

public class UserInterface {



        public static void homeScreen(String username, String password, String url){
            boolean homeScreenRunning = true;

            Scanner scanner = new Scanner(System.in);
                        try{
                while (homeScreenRunning) {
                    System.out.println("""
                        What do you want to do?
                        1) Display all products
                        2) Display all customers
                        0) Exit\n
                        Select an option:""");

                    //user input
                    int userChoice = scanner.nextInt();
                    //switch statement
                    switch (userChoice) {

                        case 1 -> Query.displayProducts(url, username, password);
                        case 2 -> Query.displayAllCategories(url, username,password);
                        case 3 -> homeScreenRunning = false;
                        default -> System.out.println("Invalid input");
                    }

                }

            } catch (NumberFormatException e) {
                            System.out.println(e.getMessage());;
                        }

        }
}
