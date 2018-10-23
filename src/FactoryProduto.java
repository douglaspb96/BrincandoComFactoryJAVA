
public class FactoryProduto {
	public static FactoryProduto fp = null;
	public int count = 0;
	private FactoryProduto() {}

	public static FactoryProduto getInstance() {
	    if (fp == null) {
	    	fp = new FactoryProduto();
	    }
	    return fp;
	}
	
	public Produto criaProduto(String name) {
		count++;
		if(name.equals(Batata.class.getName())) {
			return new Batata(count);
		}else if(name.equals(Cenoura.class.getName())) {
			return new Cenoura(count);
		}
		return null;
	}
}
