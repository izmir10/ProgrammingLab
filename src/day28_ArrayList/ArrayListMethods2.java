package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list); //[100, 200, 200, 200, 300, 400, 500]

    //    int num = 1;
    //    list.remove(num);
    //    System.out.println(list); //[100, 200, 200, 300, 400, 500]

        Integer num = 200;
        boolean r = list.remove(num);
        System.out.println(list); //[100, 200, 200, 300, 400, 500]
        System.out.println("r = " + r); //true


        System.out.println("--------------clear method-------------------");

        System.out.println(list.size()); //6

        list.clear();
        System.out.println(list.size()); //0
        System.out.println(list); // []

        System.out.println("------------indexOf & lastIndexOf methods-----------------");
        //indexOf() ==> returns the first matching element's index number, returns int
        //lastIndexOf() ==> returns the last matching element's index number, returns int

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('F');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('D');

        System.out.println("a = " + a); //0
        System.out.println("b = " + b); //3

        System.out.println("---------------contains() method---(returns boolean)---------------");

        boolean r2 = characters.contains('A'); //true

        boolean r3 = characters.contains('Z'); //false

        System.out.println("r2 = " + r2); //true
        System.out.println("r3 = " + r3); //false

        System.out.println("--------------equals() method ----(returns boolean)----------------");
        //same elements and same orders ==> otherwise ==> false

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); //false - because we created two different objects with the new keyword

        System.out.println(list1.equals(list2)); //true


        System.out.println("-----------isEmpty()------------------");

        boolean r4 = list1.isEmpty();
        System.out.println("r4 = " + r4); // false

        list1.clear();
        boolean r5 = list1.isEmpty();
        System.out.println("r5 = " + r5); //true

        System.out.println("---------------bulk operations---------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        //To use Bulk operations : we neew CollectionType
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7) );

        System.out.println(numbers); // [1, 2, 3, 4, 5, 6, 7]



    }
}
