package org.gurses.onlinebookshop;

public class Cancellation {
	int cID;
	int itemID;
	int amount;
	
	public void retrieve() {}
	public void update() {}
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
