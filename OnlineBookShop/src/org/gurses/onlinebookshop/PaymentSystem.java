package org.gurses.onlinebookshop;

public class PaymentSystem {
	int customerID;
	String customerName;
	String billAddress;
	int cardNo;
	
	public void viewOrder() {}
	
	public String paymentDetails() {
		return customerID+" "+customerName+" "+billAddress+" "+cardNo;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBillAddress() {
		return billAddress;
	}

	public void setBillAddress(String billAddress) {
		this.billAddress = billAddress;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
}
