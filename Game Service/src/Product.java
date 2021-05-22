
public class Product {
	private int id;
	private String productName;
	private double unitPrice;
	private double discount;
	private double unitPriceAfterDiscount;
	
	
	public Product(int id, String productName, double unitPrice, double discount) {
		
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.discount = discount;
		
		
		
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public double getUnitPriceAfterDiscount() {
		this.unitPriceAfterDiscount = unitPrice-(discount*unitPrice/(100));
		return unitPriceAfterDiscount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
	
	
}
