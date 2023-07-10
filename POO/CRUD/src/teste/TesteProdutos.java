package teste;

import classes.model.Produtos;

public class TesteProdutos {
	public TesteProdutos() {
		Produtos pd = new Produtos(0, "Positivo", "Notebook", "Acer", "Thinkpad", 1, "um produto", "CM", 5, 50, 100, 20, "Branco");
		pd.save();
		
		Produtos pddeleta = new Produtos(4);
		pddeleta.delete();
	}
	
	public static void main(String[] args) {
		TesteProdutos tprod = new TesteProdutos();
	}
}
