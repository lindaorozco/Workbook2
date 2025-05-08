package Week3;

import java.util.ArrayList;
import java.util.List;

public class ListMiniExercises {
    public static void main(String[] args) {

        favoriteAnimals();
        favoriteNumbers();

    }




    public static void favoriteAnimals (){
        // Step 1. Import list
        List<String> animals = new ArrayList<>();

        // Step 2. add objects into the list
        animals.add("Lions");
        animals.add("Dogs");
        animals.add("Horses");

        // Step 3. Print all of them with a loop
        for (int i = 0 ; i < animals.size(); i++) {
            System.out.println((i + 1) + " : " + animals.get(i));
        }

        // Step 4. Remove your least favorite
        animals.remove(1);
        System.out.println("Dogs have been removed: ");
        for (int i = 0; i < animals.size(); i++){
            System.out.println((i + 1)+ " : " + animals.get(i));
        }

        // Step 5. Add a new one or Update
        animals.set(1, "Birds");

        // Step 6. Print all of them in a loop
        for (int i = 0; i < animals.size(); i++){
            System.out.println((i + 1) + " : " + animals.get(i));
        }

    }
    public static void favoriteNumbers (){

        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(11);
        numbers.add(22);

        for (int i = 0; i <numbers.size(); i++) {
            System.out.println((i + 1) + " : " + "Fav numbers: "+ numbers.get(i));

//        numbers.remove(2);
//         for (int i = 0; i < numbers.size(); i++) System.out.println(i) + numbers.get(i);

        }
    }


}
