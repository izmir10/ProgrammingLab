package week13.inheritance;

public class Ebook extends Book {
    int size;
    int pages;

    public Ebook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }

    public void readBook(){
        System.out.println("reading the book from my tablet");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);
        System.out.println("price = " + price);
    }

}