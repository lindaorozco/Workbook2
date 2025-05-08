package week2.Constructors;

public class Book {
        String title;
        String author;
        int pages;


public Book(String title, String author,int pages) {
    this.title = title;
    this.author = author;
    this.pages = pages;

}
public void describe(){
            System.out.println("This book is " + title + "by " + author +" wtih " + pages + " pages");
        }
public Book (){
   this.title = " Untitled";
   this.author = "Unknown";
   this.pages = 0;
}
}
