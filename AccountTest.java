/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.time.LocalDateTime;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucien & Sharon
 */
public class AccountTest {
    
    public AccountTest() {
    }

    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double amount = 23.00;
        Account account = new Account("test");
        double result = account.deposit(amount);  
        double expResult = 23.00;
        assertTrue(expResult == result);
        assertFalse("Deposit does not equal null: ", result != 0);
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");

    }

    /**
     * Test of transfer method, of class Account.
     */
    @Test
    public void testTransfer() {
        System.out.println("transfer");

    }

    /**
     * Test of hashCode method, of class Account.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");

    }

    /**
     * Test of equals method, of class Account.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");

    }

    /**
     * Test of compareTo method, of class Account.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");

    }

    /**
     * Test of toString method, of class Account.
     */
    @Test
    public void testToString() {
        System.out.println("toString");

    }

    
}
