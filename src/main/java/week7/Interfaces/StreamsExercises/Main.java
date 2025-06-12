package week7.Interfaces.StreamsExercises;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> yearUpGroup = new ArrayList<>();

        Person p1 = new Person("Linda", "Smart");
        Person p2 = new Person("Stan", "Whatever");
        Person p3 = new Person("Kabrea", "Missing");
        Person p4 = new Person("Josh", "Sleepy");

        yearUpGroup.add(p1);
        yearUpGroup.add(p2);
        yearUpGroup.add(p3);
        yearUpGroup.add(p4);

        // Compare by last name
        List<Person> sortedList = yearUpGroup.stream()
                .sorted((person1, person2) -> person1.getLastName().compareTo(person2.getLastName()))
                .peek(p -> System.out.println( p.getName().length())) // pri
                .toList();


    }
}
