package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        Employee employee = null;

        try {
            System.out.println(employee.getSalary());
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index Out Of Bounds Exception");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Arithmetic Exception");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null Pointer Exception");
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("Runtime Exception");
        }

        System.out.println("Test Completed");

        System.out.println("------------------------------------------");

        try {
            System.out.println("Java".charAt(-1));
        } catch (RuntimeException e){
            e.printStackTrace();
        }


    }
}
