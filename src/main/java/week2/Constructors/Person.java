package week2.Constructors;

public class Person {

    //  Step 1: Make the fields private
    private String name;
    private int age;
    private String favoriteColor;

    // Step 2: Add getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;

        } else {
            System.out.println("Age cannot be negative!");
        }
    }

    public String getFavoriteColor(){
            return favoriteColor;
        }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;

    }

}

