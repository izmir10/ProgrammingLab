package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "WoodenSpoon@123";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar =0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)){
                countUpperCase++;
            }else if (Character.isLowerCase(each)){
                countLowerCase++;
            }else if (Character.isDigit(each)){
                countDigits++;
            }else {
                countSpecialChar++;
            }
        }

//        System.out.println("countUpperCase = " + countUpperCase);
//        System.out.println("countLowerCase = " + countLowerCase);
//        System.out.println("countSpecialChar = " + countSpecialChar);
//        System.out.println("countDigits = " + countDigits);

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigit = countDigits > 0;
        boolean hasSpecialChar = countSpecialChar > 0;

//        boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasUpperCase &&
//        hasLowerCase && hasDigit && hasSpecialChar;

        boolean strongPassword =false;

        if(password.length() >= 8){
            if(!password.contains(" ")){
                if(hasUpperCase){
                    if(hasLowerCase){
                        if(hasDigit){
                            if(hasSpecialChar){
                                strongPassword = true;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("strongPassword = " + strongPassword);


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