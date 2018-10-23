
public class Cenoura extends Produto {
	public Cenoura(Integer id) {
		super(id, Cenoura.class.getName(), 1.98);
	}

	@Override
	public String toString() {
		return "Cenoura = " + super.toString();
	}
	
	
}
