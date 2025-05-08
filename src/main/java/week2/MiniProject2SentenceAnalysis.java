package week2;

import java.util.Scanner;

public class MiniProject2SentenceAnalysis {
    public static void main(String[] args) {

        // 1 Import Scanner and Get User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        //2  Count the Characters

        int length = sentence.length();
        System.out.println("The sentence has " + length + " characters. ");

        // 3  Count the Words
        String [] words = sentence.split(" ");
        int wordCount = words.length;
        System.out.println("The sentence has " + wordCount + " words");

        // 4. Show First and Last Character
        if (sentence.length()>0){
            System.out.println("First character "+ sentence.charAt(0));
            System.out.println("Last character "+ sentence.charAt(sentence.length()-1));


        }


    }
}
