package day10_NestedIf;

public class CharacterIdentify {
    public static void main(String[] args) {

        char ch = 'C';

        if (ch >='0' && ch <='9') {
        System.out.println("Numerical");}

        else if ((ch >='a' && ch <='Z') || (ch >='A' && ch <='Z')){
        System.out.println("Alphabetical");}

        else {
        System.out.println("Special");}


    }
}
