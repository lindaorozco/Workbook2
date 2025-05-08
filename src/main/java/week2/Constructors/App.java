package week2.Constructors;

public class App {
    public static void main(String[] args) {

        //  Step 3: Use getters and setters in App
        Person p = new Person();
        p.setName("Alex");
        p.setAge(-5);
        p.setFavoriteColor("blue");

        System.out.println(p.getName() + " is " + p.getAge() + " years old and loves " + p.getFavoriteColor());

    }
}
