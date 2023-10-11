import java.util.Objects;

public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double accountNumber;
    private double balance;
    private String accountType;

    private double overdraft;

//    Constructor

    public BankAccount(){
        this.balance = 0;
        this.firstName = "Joe";
        this.lastName = "Smith";
        this.dateOfBirth = "5th Jan 2001";
        this.accountNumber = 5473;
        this.accountType = "Savings";
        this.overdraft = -5000;


    }

    public String getFirstName(){
        return firstName;
    }


    public void setFirstName(String John) {
        this.firstName = "Joe";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String smith) {
        this.lastName = "Smith";
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String date) {
        this.dateOfBirth = "5th Jan 2001";
    }

    public double getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int number) {
        this.accountNumber = 5473;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(int number) {
        this.balance = 0;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdrawal(int amount) {
        this.balance -= amount;
    }

    public void payInterest(String accountType){
        if ((accountType).equals("Savings")){
            this.balance *= 1.10;
        } else {
            this.balance *= 1.05;
        }
    }

}
