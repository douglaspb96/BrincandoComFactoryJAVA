
public class Produto {
	private String name;
	private double price;
	
	public Produto(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Produto [name=" + name + ", price=" + price + "]";
	}
}
