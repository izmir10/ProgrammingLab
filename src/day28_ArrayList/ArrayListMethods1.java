package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("---------------add method------------------");
        numbers.add(10); //0  //auto-boxing is done and 10 is added as an integer to the array
        numbers.add(20); //1 ==> [10, 20]
        numbers.add(30); //2 ==> [10, 20, 30]
        numbers.add(40); //3 ==> [10, 20, 30, 40]
        numbers.add(50); //4 ==> [10, 20, 30, 40, 50]
        numbers.add(60); //5 ==> [10, 20, 30, 40, 50, 60]

        numbers.add(2, 25); //[10, 20, 25, 30, 40, 50, 60] ==> 25 is inserted to the index(2)
        numbers.add(5, 45);
        System.out.println(numbers);

        System.out.println("-----------------size method--------------------");

        System.out.println(numbers.size()); //8

        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex); //7

        System.out.println("-------------get method-----------------------");

        Integer num = numbers.get(3);
        System.out.println(num); //30

        System.out.println("--------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)); //we get all the numbers from the array list
        }

        System.out.println("-------------------set method------(for replacing)-----------------");

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby"); // ==> [Java, Python, Java, C#, Ruby]

        list.set(2, "JavaScript"); // replace ==> [Java, Python, JavaScript, C#, Ruby]
        list.set(3, "C++"); // ==> [Java, Python, JavaScript, C++, Ruby]
        System.out.println(list);


        System.out.println("--------------remove method-------------------"); //remove(index) & remove(object)

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");
                                        //  0     1     2     3     4      5       6
        System.out.println(employees); //[Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);
                                       //  0       1     2     3     4       5
        System.out.println(employees); //[Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);
        employees.remove(0);
        System.out.println(employees); //[Neira, Ali, Hulya, Kaloyan]

        employees.remove(1);
        System.out.println(employees); //[Neira, Hulya, Kaloyan]

        employees.remove(employees.size()-1); // removes the last element
        System.out.println(employees); //[Neira, Hulya]

        boolean r1 = employees.remove("Hulya");
        System.out.println(employees); //[Neira]

        boolean r2 = employees.remove("Neira"); // ==> remove(object) method returns boolean result
        System.out.println(employees);

        System.out.println("r1 = " + r1); // r1 = true
        System.out.println("r2 = " + r2); // r2 = true









    }
}
