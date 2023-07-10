package teste;

import classes.model.Estoque;

public class TesteEstoque {

	public TesteEstoque() {
		
		Estoque eq = new Estoque(0, 5, "2012/12/12", 10, "2011/11/11", "2010/10/10", "1561321", 15, 2, 20, 5, 1, "Ocorr");
		eq.save();
	}
	
	public static void main(String[] args) {
		TesteEstoque teq = new TesteEstoque();

	}

}
