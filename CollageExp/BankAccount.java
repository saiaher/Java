package CollageExp;

public class BankAccount {

    long account_number;
    double balance;


    void deposit(double amount) {
        balance += amount;

    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount ac = new BankAccount();

        ac.account_number = 9373036635L;

        ac.balance = 15000.0;
        System.out.println("Account Number: " + ac.account_number);
        System.out.println("Initial Balance: " + ac.balance);

        ac.deposit(1600);
        System.out.println("Balance after deposit: " + ac.balance);

        ac.withdraw(10000);
        System.out.println("Balance after withdrawal: " + ac.balance);


        System.out.println("Account Bal " + ac.balance);

        

    }
    
}



    

