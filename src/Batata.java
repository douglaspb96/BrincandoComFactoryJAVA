
public class Batata extends Produto {
	public Batata(Integer id) {
		super(id, Batata.class.getName(), 5.99);
	}
	
	@Override
	public String toString() {
		return "Batata = " + super.toString();
	}
}
