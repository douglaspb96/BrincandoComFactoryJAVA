
public class Cenoura extends Produto {
	public Cenoura() {
		super(Cenoura.class.getName(), 1.98);
	}

	@Override
	public String toString() {
		return "Cenoura [ Name =" + getName() + ", Price = " + getPrice() + " ]";
	}
	
	
}
