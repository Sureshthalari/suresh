package p2;

import java.util.Scanner;

import p1.Bank;

public class BankAccountDetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the Account-Number:");
			long aNumber=s.nextLong();
			System.out.println("Enter the Account-HolderName:");
			String aName=s.next();
			System.out.println("Enter the InitialBalance:");
			double aInitialize=s.nextDouble();
			Bank b=new Bank(aNumber, aName, aInitialize);
			System.out.println("\nAccount created Successfully...");
			System.out.println("Account-Number::"+b.accountNumber);
			System.out.println("Account-HolderName::"+b.accountHolderName);
			System.out.println("InitialZe-Balance::"+b.balance);
			//deposite and withdraw amount
			System.out.println("Enter the Deposite Amount:");
			double dAmt=s.nextDouble();
			b.deposite(dAmt);
			System.out.println("Current balance after deposit::"+dAmt);
			System.out.println("Enter the Withdraw Amount::");
			double wAmt=s.nextDouble();
			b.withdraw(wAmt);
			System.out.println("\nCurrent balance after withdrawal::"+wAmt);
			
		}catch(Exception e) {e.toString();}
		s.close();

	}

}
