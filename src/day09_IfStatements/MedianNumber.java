package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 2;
        int b = 21;
        int c = 10;

        boolean aMedian = (a < b && a > c) || (a < c && a > b);
        boolean bMedian = (b < a && b > c) || (b < c && b > a);
        // boolean cMedian = (c < b && c > a) || (c < a && c > b);
        boolean cMedian = !aMedian && !bMedian;

        if (aMedian){ //if a is the median number
            System.out.println(a + " is the median number");}
        if (bMedian){ //if b is the median number
            System.out.println(b + " is the median number");}
        if (cMedian){ //if c is the median number
            System.out.println(c + " is the median number");}

    }
}
