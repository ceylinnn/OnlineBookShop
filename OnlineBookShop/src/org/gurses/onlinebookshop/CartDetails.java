package org.gurses.onlinebookshop;

public class CartDetails {
	int creditNo;
	int itemID;
	int amount;
	String category;
	
	public void add() {}
	
	public void checkOut() {}

	public int getCreditNo() {
		return creditNo;
	}

	public void setCreditNo(int creditNo) {
		this.creditNo = creditNo;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
