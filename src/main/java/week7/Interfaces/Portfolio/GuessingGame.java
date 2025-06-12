package week7.Interfaces.Portfolio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessingGame implements Playable {

    List<Integer> guesses = new ArrayList<>();

    public void startGame(){
        // gen a num from 1-100
        int randomNr = (int) (Math.random() * 100 ) + 1;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1-100 ");
        int choice = Integer.parseInt(scanner.nextLine().trim());

        while (choice != randomNr){
            System.out.println("KEEP GUESSING");

            // saves to the list
            guesses.add(choice);

            if (choice > randomNr){
            System.out.println("too high!");

            } else if (choice < randomNr){
                System.out.println("too low!");
            } else {
                System.out.println("correct!");
            }
        }



    }
}
