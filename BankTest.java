
package banking;

import java.util.List;
import java.util.SortedSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Sharon
 */
public class BankTest {
    
    public BankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInsufficientFundsPenalty method, of class Bank.
     */
    @Ignore("Ignore for now")
    @Test(expected = AssertionError.class)
    public void testGetInsufficientFundsPenalty() {
        System.out.println("getInsufficientFundsPenalty");
        double expResult = 0.0;
        double result = 0.0;
        double result2 = 2.0; 
        double result3 = 33333333333333.2222222222;
        assertEquals(expResult, result, 0.0);
//        assertFalse("", expResult);
        assertTrue(expResult != result3);

    }

    /**
     * Test of setInsufficientFundsPenalty method, of class Bank.
     */
    @Ignore("Ignore for now")
    @Test
    public void testSetInsufficientFundsPenalty() {
        System.out.println("setInsufficientFundsPenalty");
        double insufficientFundsPenalty = 0.0;
        Bank instance = null;
        instance.setInsufficientFundsPenalty(insufficientFundsPenalty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNAME method, of class Bank.
     */
    @Ignore("Ignore for now")
    @Test
    public void testGetNAME() {
        System.out.println("getNAME");
        Bank instance = null;
        String expResult = "";
        String result = instance.getNAME();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Bank.
     */
    @Ignore("Ignore for now")
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bank.main(args);

    }

    /**
     * Test of addAccountWizard method, of class Bank.
     */
//    @Ignore("Ignore for now")
    @Test
    public void testAddAccountWizard() {
        System.out.println("addAccountWizard");
        Bank instance = new Bank("Danny");
        instance.addAccountWizard();

    }

    /**
     * Test of getAllAccounts method, of class Bank.
     */
    @Ignore("Ignore for now")
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetAllAccounts() {
        System.out.println("getAllAccounts");
        Bank instance = new Bank("Jill");
//        SortedSet<Account> expResult = new SortedSet<>().get();  // null;
        SortedSet<Account> result = instance.getAllAccounts();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomerWizard method, of class Bank.
     */
    @Ignore("Ignore for now")
    @Test
    public void testAddCustomerWizard() {
        System.out.println("addCustomerWizard");
        Bank instance = null;
        instance.addCustomerWizard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
//    @Ignore("Ignore for now")
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String customerId = "";  
        String result = customerId;
        String expResult = null;
        assertEquals(expResult, result);
        assertNull("should be null: ", result);
        assert customer

    }

    /**
     * Test of removeCustomer method, of class Bank.
     */
    @Ignore("Ignore for now")
    @Test
    public void testRemoveCustomer() {
        System.out.println("removeCustomer");
        String customerId = "";
        Bank instance = null;
        instance.removeCustomer(customerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomers method, of class Bank.
     */
    @Ignore("Ignore for now")
    @Test
    public void testGetAllCustomers() {
        System.out.println("getAllCustomers");
        Bank instance = null;
        SortedSet<Customer> expResult = null;
        SortedSet<Customer> result = instance.getAllCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Ignore("Ignore for now")
    @Test
    public void testGetCustomer_String() {
        System.out.println("getCustomer");
        String customerId = "123456";
        Bank instance = null;
        Customer expResult = null;
        Customer result = instance.getCustomer(customerId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Ignore("Ignore for now")
    @Test
    public void testGetCustomer_String_String() {
        System.out.println("getCustomer");
        String lastName = "Doe";
        String firstName = "Jane";
        Bank instance = new Bank(firstName + " " + lastName);
        List<Customer> expResult = null;
        List<Customer> result = instance.getCustomer(lastName, firstName);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomersAccounts method, of class Bank.
     */
    @Ignore("Ignore for now")
    @Test
    public void testGetCustomersAccounts() {
        System.out.println("getCustomersAccounts");
        String customerId = "";
        Bank instance = null;
        List<Account> expResult = null;        
        List<Account> result = instance.getCustomersAccounts(customerId);
        assertEquals(expResult, result);
    }

//    private void assertFalse(double expResult, double result, double d) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
