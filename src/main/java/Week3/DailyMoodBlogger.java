package Week3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DailyMoodBlogger {
    public static void main(String[] args) {
        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // create variables
        //LocalDate

        //FileWriter

        //Buffered Reader
        BufferedReader br;

//        Requirements
//        Ask the user: “How are you feeling today?”
        System.out.println("How are you feeling today?");
        String userMood = scanner.nextLine();

//        Use LocalDate to record the date of the entry
       LocalDate ld = LocalDate.now();
//
//        Save each entry to a file in the format:
//        2025-04-23: Happy
     ;

        try (FileWriter fw = new FileWriter("MoodBlogger.txt")){
            String date = ld + " : " + userMood;
            fw.write(date);
    } catch (IOException e) {
            throw new RuntimeException(e);
        }




//        When the user chooses, show all previous mood entries
//💡   Hints
//        Use Scanner to read input
//        Use FileWriter to save, and BufferedReader to read
//        Use a loop to let the user choose between:
//[1] Log a new mood
//                [2] View past moods
//                [3] Exit



    }
}
