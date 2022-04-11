package day31_Constructors;

public class MovieObjects {
    public static void main(String[] args) {

        String genre = "Adventure, Comedy, Thriller";
        String title = "Journey to SDET: Cydeo Batch EU8";
        String[] casts = {"Asiya", "Adam", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        Movie movie1 = new Movie("USA", title, genre, "20/08/2022", "Kuzzat Altay");
        movie1.addCasts(casts);

        System.out.println(movie1);

    }
}
