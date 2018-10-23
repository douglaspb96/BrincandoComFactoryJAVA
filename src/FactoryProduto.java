
public class FactoryProduto {
	public static FactoryProduto fp = null;
	public static int count = 0;
	private FactoryProduto() {}

	public static FactoryProduto getInstance() {
	    if (fp == null) {
	    	fp = new FactoryProduto();
	    }
	    count++;
	    return fp;
	}
	
	public Produto criaProduto(String name) {
		if(name.equals(Batata.class.getName())) {
			return new Batata();
		}else if(name.equals(Cenoura.class.getName())) {
			return new Cenoura();
		}
		return null;
	}
}
