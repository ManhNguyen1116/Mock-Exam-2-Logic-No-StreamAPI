package MockQuestions2Array;

public class B extends BankAccount{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B o = new B();
		o.checkBalance();
		o.deposit(4000.00);
		o.checkBalance();
		o.withdraw(2000.00);
		o.checkBalance();
	}

}
