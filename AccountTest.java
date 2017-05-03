import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testTranfer() {
		Bank bank = new Bank("New Bank");
		Customer cust = new Customer(bank, "John", "Doe");
		Account account1 = new SavingsAccount(cust, 100.00, "Savings");
		Account account2 = new SavingsAccount(cust, 50.00, "Checking");
		final double result = 150.00;
		final double DELTA = 1E-5;
		Account.transfer(account2, account1, 50.00);
		assertEquals(result, account1.getBalance(), DELTA);
		
	}

}
