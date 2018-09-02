package swen30006.workshop.state;

import java.util.ArrayList;

public class Account {
	
	private String accountName;
	private boolean notSolved = false;
	private ArrayList<Product> boughtProduct;
	private ArrayList<Bill> billsToPay;
	private Bill bill;
	
	private enum AccountState {
		PENDING,
		ACTIVE,
		DEFAULT,
		INACTIVE,
		PRIORITY,
		CLOSED
	}
	
	private AccountState accountState = AccountState.PENDING;
	
	public Account (String accountName) {
		this.accountName = accountName;
		boughtProduct = new ArrayList<Product>();
		billsToPay = new ArrayList<Bill>();
		System.out.println(accountState);
	}
	
	public void approval (Product product) {
		boughtProduct.add(product);
		accountState = AccountState.ACTIVE;
		System.out.println(accountState);
		bill = new Bill(product.getPrice());
		billsToPay.add(bill);
	}
	
	
	public void billsAllPaid () {
		bill.setBillPaid(true);
		billsToPay.remove(bill);
		accountState = AccountState.ACTIVE;
		System.out.println(accountState);
	}
	
	public void billOutstanding () {
		if(bill.isBillPaid() == false) {
			accountState = AccountState.DEFAULT;
			System.out.println(accountState);
		} 
	}
	
	public void addProduct () {
		if(!billsToPay.isEmpty() && !boughtProduct.isEmpty()) {
			accountState = AccountState.ACTIVE;
			System.out.println(accountState);
		}
	}
	
	public void removeProduct () {
		if(billsToPay.isEmpty() && boughtProduct.isEmpty()) {
			accountState = AccountState.INACTIVE;
			System.out.println(accountState);
		}
	}
	
	public void payBills () { 
			if (bill.isDeadlineMissed() == true) {
				accountState = AccountState.CLOSED;
				System.out.println(accountState);
			} else {
				accountState = AccountState.ACTIVE;
				bill.setBillPaid(true);
				billsToPay.remove(bill);
				System.out.println(accountState);
			}
	}
	
	public void complaintResolved () {
		if(accountState == AccountState.PRIORITY && notSolved == true) {
			accountState = AccountState.ACTIVE;
			notSolved = false;
			System.out.println(accountState);
		}
	}
	
	public void makeComplaint () {
		if(accountState == AccountState.ACTIVE && notSolved == false) {
			accountState = AccountState.PRIORITY;
			notSolved = true;
			System.out.println(accountState);
		}
	}
	
	public void used (Product product) {
		boughtProduct.remove(product);
	}
	
	public void boughtProduct (Product product) {
		boughtProduct.add(product);
		bill = new Bill(product.getPrice());
		billsToPay.add(bill);
	}
	
	public void deadLinePassed () {
		bill.setDeadlineMissed(true);
	}

 }
