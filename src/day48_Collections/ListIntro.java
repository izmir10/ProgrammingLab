package day48_Collections;

import java.util.*;

public class ListIntro {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();        //ArrayList is faster in accessing elements ==> get()
        list1.addAll(Arrays.asList(10,20,30,40,50,60));

        System.out.println(list1.get(0));

        List<Integer> list2 = new LinkedList<>();       //LinkedList is faster in insertion/deleting elements ==> add, remove()
        list2.addAll(Arrays.asList(10,20,30,40,50,60));

        System.out.println(list2.get(0));

        List<Integer> list3 = new Vector<>();   //Synchronized ==> thread safe, one thread at a time
        list3.addAll(Arrays.asList(10,20,30,40,50,60));

        System.out.println(list3.get(0));

        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10,20,30,40,50,60)); //Stack is the child class of Vector.
                                                        //It is also Synchronized ==> thread safe
        System.out.println(list4.get(0));               //The difference is it has LIFO order (last in, first out)


        System.out.println("-------------------------------------------------------");

        System.out.println(list4);

        ((Stack) list4).pop();

        System.out.println(list4);

        ((Stack) list4).pop();

        System.out.println(list4);


    }


    public synchronized void method1(){


    }
}
