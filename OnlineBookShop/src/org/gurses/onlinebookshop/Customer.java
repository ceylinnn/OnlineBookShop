package org.gurses.onlinebookshop;

public class Customer {
	int cID;
	String shipName;
	String shipAddress;
	int itemCount;
	
	public void payment() {}
	
	public void addCard() {}
	
	public void addToCard() {}
	
	public void cancel() {}

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
}
