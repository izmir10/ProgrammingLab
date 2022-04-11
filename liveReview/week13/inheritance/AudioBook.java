package week13.inheritance;

public class AudioBook extends Book{
    int length;
    String narrator;

    public AudioBook(String title, String type, String author, double price) {
        super(title, type, author, price);
    }

    public void listen(){
        System.out.println("Listening to AudioBook");
    }
}
