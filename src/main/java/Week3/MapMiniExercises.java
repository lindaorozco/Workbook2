package Week3;

import java.util.HashMap;
import java.util.Map;

public class MapMiniExercises {
    public static void main(String[] args) {
        //import hashmap
        Map<String, String > words = new HashMap<>();
        // add 3 words & meaning
        words.put("Jump", "to jump around");
        words.put("Fall", "to fall over things");
        words.put("Shout", "to scream loud");

        // retrieve print 1 word
        System.out.println(words.get("Jump"));

        // replace the meaning of one specific word
        words.put("Jump", "to hop over");

        // updated list
        System.out.println("Updated: "+ words.get("Jump"));

        // check if a certain word exists in the map
        if (words.containsKey("Shout")) {
            System.out.println("The word 'shout' exists with the meaning " + words.get("Shout"));
        } else {
            System.out.println("The word 'shout' does not exist");
        }

        // to print all the keys use a 'for' loop
        for (String word : words.keySet()) {
            System.out.println(words.get(word));
        }
        // to print all the values
        for (String meaning : words.values()) {
            System.out.println(meaning);
        }
}
}
