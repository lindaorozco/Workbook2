package week2.Constructors;

public class Cupcake {
    String flavor;
    int calories;

    public Cupcake (String flavor, int calories){
        this.flavor = flavor;
        this.calories = calories;

        System.out.println("Created a cupcake: " + flavor + "," + calories);
    }
}
