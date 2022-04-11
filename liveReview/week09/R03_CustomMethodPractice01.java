package week09;

public class R03_CustomMethodPractice01 {
    public static void main(String[] args) {

        int personOneAge = 10;

        if (personOneAge >= 21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy");
        }

        int personTwoAge = 20;

        if (personTwoAge >= 21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy");
        }

        int personThreeAge = 30;

        if (personThreeAge >= 21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy");
        }

        System.out.println("------------------------------------");
        eligibleOrNot(43);
        eligibleOrNot(personOneAge);
        eligibleOrNot(personTwoAge);
        eligibleOrNot(personThreeAge);

    }

//access-modifier    specifier      return-type        method name (Parameter)
    public            static          void            eligibleOrNot(int age){ //no return type, just displays or prints
        if (age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy");
        }
    }
}
