
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


	class Transaction{
		String type;
		int amount; 
		public Transaction(String type,int amount){
			this.type=type;
			this.amount=amount;
        }
        public String toString(){
            return type +":$" + amount;
        }
    }


class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
   ArrayList<Transaction>transactions = new ArrayList<>();

    public BankAccount(String accountHolderName,String accountNumbeString, double initialBalance) {
       this. accountHolderName = accountHolderName;
       this.accountNumber = accountNumber;
       this. balance = initialBalance;
    }


    // Deposit method
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
           transactions.add(new Transaction("deposit",amount));
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    // public void SaveAccount(){
    //     try{
    //         File file = new File("account.txt");
    //         if (file.createNewFile()){
    //           System.out.println("File acount.txt");
                
    //         }
    //     }
    // }

    // Withdraw method
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
           transactions.add(new Transaction("withdrawn",amount));
        } else {
            System.out.println("invalid amount.");
        }
    }

    // Balance inquiry method
    public void checkBalance(){
        System.out.println("Current Balance: $" + balance);
    }
//transaction history method
  public void viewTransactionHistory(){
    for(Transaction t : transactions){
        System.out.println(t);
    }
  }

}
 

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Account creation
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.println("Enter account Number");
        String number = scanner.nextLine();
        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();

        BankAccount account = new BankAccount(name,number, initialDeposit);
        System.out.println("Account created successfully!");

        // Menu-driven operations
        int choice;
         {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4.view transaction history");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawalAmount = scanner.nextInt();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
               case 4:
                     System.out.print("view transaction history");
                     double transactionAmount=scanner.nextDouble();
                     break;
                case 5:
                    System.out.println("Thank you for using the Bank Application!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

