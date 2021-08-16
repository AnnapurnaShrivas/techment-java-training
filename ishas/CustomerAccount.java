package com.techment.ishas;

class Customer
{
	int customerid;
	String customername;
	Account account;
	public Customer(int customerid, String customername, Account account) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.account = account;
	}
	
	void showDetails() {
		
		System.out.println(" Customer id = "+customerid);
		System.out.println(" Customer Name = "+customername);
		System.out.println(" Account No. = "+account.accountno);
		System.out.println(" Account Type = "+account.accounttype);
		System.out.println(" Account IFSC code = "+account.ifsc);
		System.out.println(" Account branch Name = "+account.branch);
		System.out.println(" \nTotal Balance You have in your Account = "+account.balance);

	}
	
}

class Account
{
	int accountno;
	String accounttype;
	int balance;
	int ifsc;
	String branch;
	public Account(int accountno, String accounttype, int balance, int ifsc, String branch) {
		super();
		this.accountno = accountno;
		this.accounttype = accounttype;
		this.balance = balance;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
	
	
}

public class CustomerAccount {

	public static void main(String[] args) {
		
        Account account = new Account(0001, "Saving" , 50000, 1234567890, "Railway Branch");
        Customer customer = new Customer(0000111, "Annapurna Shrivas", account);
        
        customer.showDetails();
	}

}
