
public class Batata extends Produto {
	public Batata() {
		super(Batata.class.getName(), 5.99);
	}
	
	@Override
	public String toString() {
		return "Batata [ Name =" + getName() + ", Price = " + getPrice() + " ]";
	}
}
