/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankofateam;

import java.util.ArrayList;

/**
 *
 * @author Sharon
 */
public class Bank {
    Bank() {        
    }

    void addAccount() {
        // Creates a new bank account
    }
    
    /**
     * Deletes a given account
     * @param accountId 
     */
    void removeAccount(String accountId){
       
    }
    
    void getAccounts() {
        // Generates a report of all current accounts, in account ID order
    }
    
    Account getAccount(String accountId) {
        // Flavio
        // Find an account given an account ID
        Account a = new Account();
        return a;
    }
    
    void addCustomer() {
        // adds a new customer to the bank
    }
    
    void removeCustomer(String customerId) {
        // Deletes a customer from the bank.
    }
    
    void getCustomers() {
        // Generates a report of all current customers in customer ID order
    }
    
    Customer getCustomer (String customerId) {
        // Flavio
        // Get a Customer object, given a customer's Id
        Customer c = new Customer();
        return c;
    }
    
    List<Customer> getCustomer(String lastName, String firsName) {
        // Flavio
        // Get a list of Customer objects, given a customer's last and first names.
        // Assume customer names are unique.
//        List<Customer> c = new ArrayList<>();
//        return List<customer> c;
    }    
    
    List<Account> getCustomersAccounts (String customerId) {
        // Flavio
        // Return a list of a given customer's accounts (if any)
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
                
        Bank bank = new Bank();
        
    }
}