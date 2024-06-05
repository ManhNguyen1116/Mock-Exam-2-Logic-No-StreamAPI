package MockQuestions2Array;

public class BankAccount {
	private double balance = 1000.00;;

	public BankAccount() {
		
	}
	
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		double n = getBalance();
		n += amount;
		setBalance(n);
	}
	
	public void withdraw(double amount) {
		double n = getBalance();
		n -= amount;
		setBalance(n);
	}
	
	public void checkBalance() {
		System.out.println(getBalance());
	}
}
