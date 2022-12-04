package shoppingSystem;

public class Invoice {
	
	private int id;
	private int totalPrice;

	public Invoice() {
		super();
	}
	public Invoice(int id, int totalPrice) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String toString() {
		return "id: "+this.id+" price: "+this.totalPrice;
	}
}
