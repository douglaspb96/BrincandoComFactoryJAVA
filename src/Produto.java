
public class Produto {
	private String name;
	private double price;
	private Integer id;
	
	public Produto(Integer id, String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
	}
	
	public Integer getId() {
		return id;
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
		return "[ (#"+getId()+") " + getName() + ", R$ " + getPrice() + " ]";
	}
}
