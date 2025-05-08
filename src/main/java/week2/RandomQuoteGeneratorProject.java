package week2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomQuoteGeneratorProject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // boolean set to true bc
        boolean runningProgram = true;

        // Step 1: get list of quotes

        String[] quotes = {"Code is art. \n", "Keep it simple.\n", "Bug happens.\n", "Fix it fast.\n", "Think first.\n", "Less is more.\n", "Hello, bug.\n", "Trust the code.\n", "Code, sleep, repeat.\n", "Break, then build.\n"
        };

        // launches the method and takes quotes with it
        writeToFile(quotes);


        while (runningProgram) {



                System.out.println("Type 'enter' to see a quote, or type 'exit' to stop");

                // user inputs the info
                String userInput = scanner.nextLine().trim().toLowerCase();

                if (userInput.equals("enter")) {

                    // use a random to pick a quote each time
                    int randomNr = (int) (Math.random() * quotes.length);
                    System.out.println(quotes[randomNr]);

                } else if (userInput.equals("exit")) {
                    System.out.println("bye");
                    runningProgram = false;

                }

            }

        }
        public static void writeToFile(String [] quotes){
            try (FileWriter fw = new FileWriter("quotes.txt")) {
                // write inside the file
                for (String line: quotes ){
                    fw.write(line);
                }


            } catch (IOException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }

        }
    }


