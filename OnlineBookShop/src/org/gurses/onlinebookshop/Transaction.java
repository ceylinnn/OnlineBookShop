package org.gurses.onlinebookshop;

public class Transaction {
	int transID;
	double transDate;
	int amount;
	
	public void commit() {}
	
	public void rollback() {}

	public int getTransID() {
		return transID;
	}

	public void setTransID(int transID) {
		this.transID = transID;
	}

	public double getTransDate() {
		return transDate;
	}

	public void setTransDate(double transDate) {
		this.transDate = transDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
