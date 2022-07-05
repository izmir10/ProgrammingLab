package weekUnknown;

public class Tests {
    public static void main(String[] args) {

        System.out.println("PracticeTasks.isArmstrong(153) = " + PracticeTasks.isArmstrong(153));

        System.out.println("PracticeTasks.isArmstrong(123) = " + PracticeTasks.isArmstrong(123));

        for (int i = 100; i<10000; i++){
            if (PracticeTasks.isArmstrong(i)){
                System.out.println("i = " + i);
            }
        }

        System.out.println("---------------------------");

        String[] steps = {"x/","y/","../","z/","./"};

        System.out.println(PracticeTasks.minSteps(steps));

    }
}
