package day11_Switch_Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 100_000;
        boolean isMarried = true;
        double taxRate = 0;
        //int result = 0;

        /*
        if (!isMarried) {
        if (salary >= 130000) {
                result = salary - (salary*35/100);
            } else if (salary >=100000 && salary < 130000) {
                result = salary - (salary*30/100);
            } else if (salary >=80000 && salary < 100000) {
                result = salary - (salary*25/100);
            } else {
                result = salary - (salary*20/100);
            }

        } else if (salary >= 130000) {
            result = salary - (salary*30/100);
        } else if (salary >=100000 && salary < 130000) {
            result = salary - (salary*25/100);
        } else if (salary >=80000 && salary < 100000) {
            result = salary - (salary*20/100);
        } else {
            result = salary - (salary*15/100);
        }
*/

        if (salary >= 130000) {
            taxRate = 0.35;
        } else if (salary >= 100000) {
            taxRate = 0.30;
        } else if (salary >= 80000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }

        if (isMarried) {
            taxRate -= 0.05;
        }

        double salaryAfterTax = salary - (salary * taxRate);
        System.out.println("Salary After Tax = " + salaryAfterTax);

    }
}
