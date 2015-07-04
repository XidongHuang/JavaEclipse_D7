package Account_Customer;

public class Test {
	public static void main(String[] args) {
		Customer js = new Customer("Jane", "Smith");
		js.setAccount(new Account(1000, 2000, 0.0123));
		
		js.getAccount().deposit(100.00);
		js.getAccount().withdraw(960.00);
		js.getAccount().withdraw(2000.00);
		
		System.out.println("Customer [" +js.getFirstName()+","+js.getLastName()+"] has a account: id is " + js.getAccount().getId()+", annualInterestRate is "+ 
		js.getAccount().getAnnualInterestRate()*100+"%, balance is "
				+ "" + js.getAccount().getBalance());
		
	}
}
