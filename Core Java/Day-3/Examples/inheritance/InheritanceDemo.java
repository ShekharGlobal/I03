package com.example.handson;

class BankAccount {
	protected double withdrawAmount;
	protected double depositAmount;
	protected double interestRate = 9.5;
	protected double balance;

	public void depositMoney(double amount) {
		depositAmount = amount;
		balance += amount;
		System.out.println("Deposited: " + amount);
	}

	public void withdrawMoney(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient balance!");
		} else {
			withdrawAmount = amount;
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		}
	}
}

class NRIAccount extends BankAccount {
	public void applyFixedDeposit() {
		interestRate = 6.5;
		System.out.println("NRI Account Interest Rate: " + interestRate);
	}
}

class SeniorCitizenAccount extends BankAccount {
	public void applyFixedDeposit() {
		interestRate = 10.5;
		System.out.println("Senior Citizen Account Interest Rate: " + interestRate);
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		BankAccount nri = new NRIAccount();
		BankAccount senior = new SeniorCitizenAccount();

		nri.depositMoney(5000);
		nri.withdrawMoney(2000);
		//((NRIAccount) nri).applyFixedDeposit();
		System.out.println("NRI Account Balance: " + nri.balance);

		senior.depositMoney(8000);
		senior.withdrawMoney(3000);
		//((SeniorCitizenAccount) senior).applyFixedDeposit();
		System.out.println("Senior Citizen Account Balance: " + senior.balance);
	}
}
