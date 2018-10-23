public class App {
	public static void main(String[] args) {
		FactoryProduto fp = FactoryProduto.getInstance();

		System.out.println(fp.criaProduto("Batata"));
		System.out.println(fp.criaProduto("Cenoura"));
		System.out.println(fp.criaProduto("Maca"));
		System.out.println(fp.criaProduto("Batata"));
		System.out.println("Contador: "+fp.count);
	}
}
