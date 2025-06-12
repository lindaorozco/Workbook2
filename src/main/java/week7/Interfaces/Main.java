package week7.Interfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Piano piano = new Piano();
        Guitar guitar = new Guitar();
        piano.play();
        guitar.play();

        Document doc = new Document();
        printAnything(doc);

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime.getHour());



    }
    static void printAnything (Printable printable){
        System.out.println("Printing something ");
    }


}
