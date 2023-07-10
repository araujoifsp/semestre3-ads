package teste;

import classes.model.Categorias;

public class TesteCategorias {
	
	public TesteCategorias() {
		Categorias ct = new Categorias(0, "Teste");
		ct.save();
		
		Categorias ct2 = new Categorias(1, "Teste");
		ct2.delete();
		
		
	}
	
	public static void main(String[] args) {
		TesteCategorias c = new TesteCategorias();
	}

}
