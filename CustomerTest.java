import static org.junit.Assert.*;

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
	

}