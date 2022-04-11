package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "DyNo@12366";

        boolean req1 = password.length() >= 8 && !password.contains(" ");

        boolean req2 = false; //has upper case
        boolean req3 = false; //has lower case
        boolean req4 = false; //has special char
        boolean req5 = false; //has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                req2 = true;
            } else if (Character.isLowerCase(each)) {
                req3 = true;
            } else if (Character.isDigit(each)) {
                req5 = true;
            } else {    //special char
                req4 = true;
            }

            /*
            if (req2 && req3 && req4 && req5){
                break;
            }
            */
        }

        boolean isStrongPassword = req1 && req2 && req3 && req4 && req5;

        System.out.println("Is this a strong password? " + isStrongPassword);


    }

}

/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */