package week2;

import java.util.Scanner;

public class stringExercises {
    public static void main(String[] args) {
        // 1 Hello name

        String name = "Linda";
        System.out.println("Hello "+ name);

        //2 String Length
       String fullName = "Linda Monique Orozco";
       int length = fullName.length();
        System.out.println(length);

        // 3 First and Last Character
        char firstChar = name.charAt(0);
        System.out.println(firstChar);
        char lastChar = name.charAt(4);
        System.out.println(lastChar);

        //4 Uppercase or Lowercase?
        String State = "mexico";
        State = State.toUpperCase();
        System.out.println(State);
       State = State.toLowerCase();
        System.out.println(State);

        // 5 String Contains "Java"
        String sentence = "Learning this new thing called Java and it's cool";
        boolean hasJava = sentence.contains("Java");
        System.out.println(hasJava);

        // 6 Are they equal?
        String s1 =" ABC ";
        String s2 = " abc ";
        boolean areEqual = s1.equals(s2);
        System.out.println("are they equal? "+ areEqual);
        String s3 = "ABC";
        String s4 = "ABC";
        boolean areSame = s3.equals(s4);
        System.out.println("are the same? "+ areSame);

        //7 Start and End Match
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        boolean startsWith = word.startsWith("A");
        boolean endsWith = word.endsWith("Z");
        System.out.println("Starts with A & ends with Z " + startsWith + endsWith);











        }


    }
