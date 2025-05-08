package Week5.StaticClasses;

import java.util.Arrays;

public class NameFormatter {

    private NameFormatter(){

    }

    // create constructor
    public static String format (String firstName, String lastName){
        String fullName;

       lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
       firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        fullName = lastName + " " + firstName;

        return fullName;
    }

    public static String format (String prefix, String firstName, String middleName, String lastName, String suffix){
        String fullName;
        fullName = prefix + " ," + firstName + " " + middleName;
       return fullName;

    }
}
