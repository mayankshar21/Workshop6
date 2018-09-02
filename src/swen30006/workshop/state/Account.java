package swen30006.workshop.state;

import java.util.ArrayList;
import java.util.Random;

public class Account {
	
	private String accountName;
	private String productBought;
	
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
	}
	
	public void approval () {
		Product product = new Product();
		
	}
	
	public void billOutstanding () {
		
	}
	
	public void addProduct () {
		
	}
	
	public void removeProduct () {
		
	}
	
	public void payBills () {
		
	}
	
	public void complaintResolved () {
		
	}
	
	public void makeComplaint () {
		
	}
}
