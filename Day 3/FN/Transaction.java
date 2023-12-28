public class Transaction {

    public static void main(String[] args) {
        Account A = new Account(1234, "XYZ", 5000);
        Account B = new Account(6789,"ABC",2500);
        A.transferAmount(B,1500);
        B.transferAmount(A, 3000);
    }
    
}
class Account{
    int accountId;
    String accountHolderName;
    double balance;
    Account(int accountId,String accountHolderName,double balance){
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void printReceipt(){
        System.out.println("Account Id : "+ accountId);
        System.out.println("Name : " + accountHolderName);
        System.out.println("Account Balance : "+ balance);
    }
    void transferAmount(Account receiver,double amount){
        if(balance >= amount ){
            receiver.balance += amount;
            balance -=amount;
            this.printReceipt();
        }
        else{
            System.out.println("Invalid transaction !! Not enough money");
        }
    }
}
