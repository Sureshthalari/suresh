package p1;

public class Bank {
	public long accountNumber;
	public String accountHolderName;
	public double balance;
	
	public Bank(long accountNumber,String accountHolderName,double initializeBalance) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		if(initializeBalance>=0) {
			this.balance=initializeBalance;
		}
		else {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
	}
	
	// Method to deposit money into the account
	public void deposite(double amount) {
		if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
	}
	public void withdraw(double amount) {
		 if (amount > 0) {
	            if (this.balance >= amount) {
	                this.balance -= amount;
	                System.out.println(amount + " withdrawn successfully.");
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	}
	  // Method to check the current balance
    public double checkBalance() {
        return this.balance;
    }
    // Getter for account holder's name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for account number
    public long getAccountNumber() {
        return accountNumber;
    }

}
