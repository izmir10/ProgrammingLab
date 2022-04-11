package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void checkBalance(){
        System.out.println(accountHolder +" your available balance is: $" + balance);
    }

    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Depositing amount can not be zero or negative");
            return; // exits the method
        }
        balance += amount;
        System.out.println("You deposited $" + amount + " and your current balance is $" + balance);
    }

    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("Withdrawing amount can not be zero or negative");
            return; // exits the method
        }

        if (amount > balance){
            System.out.println("Insufficient balance");
            return; // exits the method
        }

        balance -= amount;
        System.out.println("You withdraw $" + amount + " and your current balance is $" + balance);
    }


}

/*
BankAccount Task:
	        Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance
	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount
 */