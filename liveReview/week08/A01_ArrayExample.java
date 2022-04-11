package week08;

import java.util.Arrays;

public class A01_ArrayExample {
    public static void main(String[] args) {

        int code = 200;

        int[] codes = new int[8];//holds 8 elements, they are all integer

        System.out.println(Arrays.toString(codes));//how we print the array

        //default values of data types:
        // int = 0 / double = 0.0 / String = null / char = ''
        // Array starts from 0 index

        codes[0]=200; //first element of the array
        codes[1]=201; //second element
        System.out.println(Arrays.toString(codes));

        int[] statusCodes = {201, 2020, 204, 400, 401, 403, 404, 500}; // another way of declaring and initialing array
        System.out.println(Arrays.toString(statusCodes));

        System.out.println("-----------------size of an array-------------------");
        //for String str = "Java"; str.length() ---> size of the String

        //for arrays, length get no parameter and returns an integer
        System.out.println("The size of the array: "+ statusCodes.length);

        int sizeOfArray = statusCodes.length; // 8, you can use it for creating loops

        System.out.println("-----------------------String-----------------------------");
        String[] responseTypes = new String[]{"OK", "Created", "No Content", "Bad Request",
        "Unauthorized", "Forbidden", "Not Found", "Internal Server Error"}; //3rd way of declaration

        System.out.println(Arrays.toString(responseTypes));
        System.out.println("Length of the responseTypes Array: "+responseTypes.length);

        for (int i = 0; i < sizeOfArray; i++) {
            String text = statusCodes[i]+" : "+responseTypes[i];
            System.out.println("Each Status Code Means = "+text);
        }

        System.out.println("-----------------FOR EACH LOOPs--------------------------");
        //it is used when you have collection
        //arraylist, map, list, set, ...



    }
}
