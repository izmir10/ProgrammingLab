package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python", "Wooden Spoon"};

        for (int j = 0; j < words.length; j++) { //outer loop repeats every element once for inner loop to compare
            String element = words[j]; //Java
            int frequency = 0;

            for (int i = 0; i < words.length; i++) { // inner loop finds the frequency
                if (words[i].equals(element)){
                    frequency++;
                }
            }

            if(frequency==1){
                System.out.println(element);
            }

        }




    }
}
