public class bankAccount {
    private String accountHolder;
    private double accountNumber;
    private double balance;

    public bankAccount(String accountHolder, double accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.printf("Deposited successfully" , amount);
        }else {
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("invalid withdrawal amount");
        } else if(amount > balance){
            System.out.println("insufficiant balance");
        } else {
            balance = amount;
            System.out.println("withdrawal successfull");
        }
    }

    public void displayDetails(){
        System.out.println("account holder : " + accountHolder);
        System.out.println("account number : " + accountNumber);
        System.out.println("current balance : " + balance);
    }
    public static void main(String[] args){
        bankAccount account = new bankAccount("vani", 10002, 5000);


         account.displayDetails();
        System.out.println();

         account.deposit(500);
         account.displayDetails();
        System.out.println();

        account.withdraw(200);
        account.displayDetails();
        System.out.println();

        account.withdraw(2000);
        System.out.println();
    }
    
}
