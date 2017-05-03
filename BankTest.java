import static org.junit.Assert.*;



import org.junit.Test;

public class BankTest {

	@Test
	public void testGetAllAccounts() {
		Bank bank = new Bank("The Bank");
		assertNotNull(bank.getAllAccounts());
	}

	@Test
	public void testAddCustomer() {
		Bank bank = new Bank("My Bank");
		Customer cust = new Customer(bank, "John", "Doe");
		String result = cust.getCustomerId();
		assertEquals(result, bank.addCustomer("Doe", "John"));		
	}
	
	@Test
	public void testRemoveCustomer() {
		Bank bank = new Bank("My Bank");
		Customer cust = new Customer(bank, "John", "Doe");
		String customerId = bank.addCustomer("Doe", "John");
		bank.removeCustomer(customerId);
		assertNull(bank.getCustomer(customerId));	
	}
}
