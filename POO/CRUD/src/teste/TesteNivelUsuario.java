package teste;

import classes.model.Nivelusuarios;

public class TesteNivelUsuario {
	
	public TesteNivelUsuario() {
		Nivelusuarios nv = new Nivelusuarios(0, "teste");
		nv.save();
		
		Nivelusuarios nvd = new Nivelusuarios(8);
		nvd.delete();
	}

	public static void main(String[] args) {
		TesteNivelUsuario tnv = new TesteNivelUsuario();
	}

}
