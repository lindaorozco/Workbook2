package week2.Constructors;

public class AppBook {
    public static void main(String[] args) {

        Book myBook = new Book ("Java for starters, ", "Maaike", 100);
        System.out.println(myBook.title);

        myBook.describe();

        Book b1 = new Book ("Book one", "Alice", 150);
        Book b2 = new Book ("Book two", "Bob", 200);
        Book b3 = new Book ("Book three", "Charlie", 300);

        b1.describe();
        b2.describe();
        b3.describe();

        Book mysteryBook = new Book();
        mysteryBook.describe();
    }
}
