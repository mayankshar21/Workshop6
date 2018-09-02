package swen30006.workshop.state;

import java.util.Random;

public class Bill {
	private int billNo;
	private int amountToPay;
	private boolean billPaid = false;
	private boolean deadlineMissed = false;
	
	public Bill (int amountToPay) {
		Random random = new Random();
		billNo = random.nextInt(100);
		this.amountToPay = amountToPay;
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public int getAmountToPay() {
		return amountToPay;
	}

	public void setAmountToPay(int amountToPay) {
		this.amountToPay = amountToPay;
	}

	public boolean isBillPaid() {
		return billPaid;
	}

	public void setBillPaid(boolean billPaid) {
		this.billPaid = billPaid;
	}

	public boolean isDeadlineMissed() {
		return deadlineMissed;
	}

	public void setDeadlineMissed(boolean deadlineMissed) {
		this.deadlineMissed = deadlineMissed;
	}
}
