package exercises;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        //create two Account objects
        Account account1 = new Account("Momo Hirai", 50.00);
        Account account2 = new Account("Sana Minatozaki", -7.53);
        //display the initial account's balance
        System.out.printf("%s's balance is: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s's balance is: $%.2f%n", account2.getName(), account2.getBalance());
        //create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding  $%.2f to account1's balance%n", depositAmount);
        account1.deposit(depositAmount);
        //display balances
        System.out.printf("%s's balance is: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s's balance is: $%.2f%n", account2.getName(), account2.getBalance());
        //add money to account2
        System.out.print("Enter the deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdding $%.2f to account2's balance%n", depositAmount);
        account2.deposit(depositAmount);
        //display balances
        System.out.printf("%s's balance is: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s's balance is: $%.2f%n", account2.getName(), account2.getBalance());
    } //end main
} // end class AccountTest
