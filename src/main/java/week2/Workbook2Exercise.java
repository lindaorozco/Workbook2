package week2;

import java.util.Arrays;
import java.util.Scanner;

public class Workbook2Exercise {
    public static void main(String[] args) {
        // enter team
      //  Team1:Team2|Score1:Score2
        //score information of an event
        Scanner scanner = new Scanner(System.in);

        // Step 1: enter user
        System.out.println("Please enter a game score : using format Team1:Team2|Score1:Score2");
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        // Step 2: split into teams
        // Team1:Team2|Score1:Score2
        String[] teams = userInput.split("\\|")[0].split(":");

        System.out.println(Arrays.toString(teams));

        // Split into scores
        String [] scores = userInput.split("\\|")[1].split(":");
        System.out.println(Arrays.toString(scores));

        // compare scores
        if (Integer.parseInt(scores[0])>Integer.parseInt(scores[1])) {
            System.out.println("Winner is: " + teams[0]);
        } else {
            System.out.println("Winner is: "+ teams[1]);

        }





    }
}
