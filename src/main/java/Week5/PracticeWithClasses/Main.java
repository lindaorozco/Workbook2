package Week5.PracticeWithClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school = new School("Bell High", "6060 E Spring St");
        School school1 = new School("High School", "123 street");

        Student student = new Student("Stan", "Male", 29);
        Student student1 = new Student("Linda", "Female", 27);

        System.out.println(student.getName() + "|" +  student.getGender() + "|" + student.getAge());


        System.out.println(student.toFileString());
        System.out.println(student);

    }
}
