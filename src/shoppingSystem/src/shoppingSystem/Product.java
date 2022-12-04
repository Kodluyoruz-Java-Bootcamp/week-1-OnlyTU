package shoppingSystem;

public class Product {

	
	private String name;
	private String category;
	private int price;
	private int stockInformation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStockInformation() {
		return stockInformation;
	}
	public Product(String name, String category, int price, int stockInformation) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.stockInformation = stockInformation;
	}
	public Product() {
		super();
	}
	public void setStockInformation(int stockInformation) {
		this.stockInformation = stockInformation;
	}

}
