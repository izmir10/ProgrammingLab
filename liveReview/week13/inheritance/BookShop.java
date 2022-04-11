package week13.inheritance;

public class BookShop {
    public static void main(String[] args) {

        AudioBook audioBook = new AudioBook("Memories, Dreams, Reflections", "Psychology", "Carl Jung", 34);
        Ebook ebook = new Ebook("To Kill A Mockingbird", "Novel", "Harper Lee", 12);

        System.out.println(audioBook);
        System.out.println(ebook);

    }
}
