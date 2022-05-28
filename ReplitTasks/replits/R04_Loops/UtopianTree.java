package replits.R04_Loops;

public class UtopianTree {
    public static void main(String[] args) {

        int size = 0;
        int year = 0;

        while (year<3){
            year++;
            size++;
            System.out.println("year " + year + " - growth 1 cm");
            System.out.println("tree size: " + size + " cm");
            System.out.println();
        }

        while (year <10){
            year++;
            size+=2;
            System.out.println("year " + year + " - growth 2 cm");
            System.out.println("tree size: " + size + " cm");
            System.out.println();

        }

    }
}
/*
* The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year. Show 10 years of growth of the Utopian Tree.

Output:

year 1 - growth 1 cm
tree size: 1cm
​
year 2 - growth 1 cm
tree size: 2cm
​
year 3  - growth 1 cm
tree size:3cm
​
year 4 - growth 2 cm
tree size: 5cm
​
year 5 - growth 2 cm
tree size: 7cm
​
year 6 - growth 2 cm
tree size: 9cm
​
... until you reach year 10*/