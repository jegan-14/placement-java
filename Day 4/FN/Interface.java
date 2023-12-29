
public class Interface {

    public static void main(String[] args) {
        SavingsAccount savingsObj = new SavingsAccount(111, 1500.0, 0.05);
        
        System.out.println("SAVINGS ACCOUNT");
        savingsObj.deposit(500.0);
        savingsObj.withdraw(200.0);
        System.out.println("Savings Account Balance: " + savingsObj.checkBalance());
        savingsObj.addInterest();
        System.out.println("Savings Account Balance after interest: " + savingsObj.checkBalance());

        CheckingAccount checkingObj = new CheckingAccount(222, 2000.0, 500.0);
        System.out.println("CHECKING ACCOUNT");
        checkingObj.deposit(1000.0);
        checkingObj.applyOverdraft(2500.0);
        System.out.println("Checking Account Balance: " + checkingObj.checkBalance());

        LoanAccount loanObj = new LoanAccount(333, 2500.0, 0.1);
        System.out.println("LOAN ACCOUNT");
        loanObj.withdraw(1000.0);
        loanObj.chargeInterest();
        System.out.println("Loan Account Balance after interest: " + loanObj.checkBalance());
    }
    
}

interface AccountInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

abstract class AccountAbstractClass implements AccountInterface{
    int accountNumber;
    double balance;
    
    AccountAbstractClass(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    @Override
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    @Override
    public void withdraw(double amount){
       if(amount<=balance){
           System.out.println("Not enough balance");
       } 
       else{
           balance-=amount;
           System.out.println("Withdrawn :"+balance);
       }
    }
    public double chechBalance(){
        return balance;
    }
}

class SavingsAccount extends AccountAbstractClass {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = checkBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

class CheckingAccount extends AccountAbstractClass {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void applyOverdraft(double amount) {
        if (amount > balance && amount <= balance + overdraftLimit) {
            withdraw(amount);
            System.out.println("Overdraft applied: " + amount);
        } else {
            System.out.println("Invalid overdraft amount or exceeds limit.");
        }
    }
    @Override
    public double checkBalance() {
        return balance;
    }
    
}

class LoanAccount extends AccountAbstractClass {
    private double interestRate;

    public LoanAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void chargeInterest() {
        double interest = checkBalance() * interestRate;
        withdraw(interest);
        System.out.println("Interest charged: " + interest);
    }
    
    @Override
    public double checkBalance() {
        return balance;
    }
}