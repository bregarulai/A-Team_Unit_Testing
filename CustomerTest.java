import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Flavio Luis
 *
 */
public class CustomerTest {

	@Test
	public void testCustomerConstructor() {
		String bankName = "new bank";
		Bank myBank = new Bank(bankName);
		String lastName = "Doe";
		String firstName = "John";
		
		Customer johnDoe = new Customer(myBank, lastName, firstName);
		assertNotNull(johnDoe);
		
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetBank() {
		String bankName = "new bank";
		Bank myBank = new Bank(bankName);
		assertNotNull(myBank);
		
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerAccounts() {
		Bank bank = new Bank("New Bank");
		Customer cust = new Customer(bank, "John", "Doe");
		Account account = new SavingsAccount(cust, 123.34, "Savings");
		
		Set<Account> accounts = new TreeSet<>();
		accounts.add(account);
		assertNotNull(accounts);
		
		fail("Not yet implemented");
				
	}
	
	@Test
	public void testYtdFees() {
		Bank bank = new Bank("New Bank");
		Customer cust = new Customer(bank, "John", "Doe");
		Account account = new SavingsAccount(cust, 123.34, "Savings");
		double result = 123.34 * 2.0;
		assertEquals(result, account.get);
		
	}
}