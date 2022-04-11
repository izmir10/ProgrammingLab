package day14_StringClass;

public class StringMethods2 {
    public static void main(String[] args) {
        //replace (old value ---> new value)

        String str = "Java is fun, I love learning Java";

        String str2 = str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JaohnSmith@yahoo.com"; // change yahoo to gmail

        email = email.replace("yahoo", "gmail");
        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", ""); //Java Java   C# C# C++ C++
               sentence2 = sentence2.replace("   ", " ");

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2 =  "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);

        System.out.println("---------------------------------------");

        // replaceFirst method changes the first matching value only

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);





    }

}
