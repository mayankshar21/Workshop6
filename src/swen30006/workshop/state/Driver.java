package swen30006.workshop.state;

public class Driver {
	
	public static void main (String[] args) {
		
		Account account = new Account("Mayank");
		Product product = new Product("FinancialProduct", 15);
		
		account.approval(product);
		
		account.billsAllPaid();
		
		account.makeComplaint();
		
		account.complaintResolved();
		
		account.used(product);
		
		account.removeProduct();
		
		Product newProduct = new Product("NewProduct", 16);
		
		account.boughtProduct(newProduct);
		
		account.addProduct();
		
		account.billOutstanding();
		
		account.payBills();
		
		account.used(newProduct);
		
		account.removeProduct();
		
		Product lastProduct = new Product("LastProduct", 17);
		
		account.boughtProduct(lastProduct);
		
		account.addProduct();
		
		account.billOutstanding();
		
		account.deadLinePassed();
		
		account.payBills();
	}
	
}
