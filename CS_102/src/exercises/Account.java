package exercises;

public class Account {
    private String name;
    private double balance;
    //constructor
    public Account(String name, double balance){
        this.name = name;
        if (balance > 0) this.balance = balance;
    }
    //method that adds only a valid amount to the balance
    public void deposit(double depositAmount){
        if (depositAmount > 0)
            this.balance = this.balance + depositAmount;
    }
    //method that returns the account balance
    public double getBalance(){
        return this.balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
