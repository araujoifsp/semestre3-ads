package teste;

import classes.model.Institucional;

public class TesteInstitucional {
	
	public TesteInstitucional(){
		Institucional i = new Institucional(0, "Gabriel", "00000000000", 'F', "Av salgado filho", "Vila rio", "guarulhos", "sp", "0000000", "11122334", "teste@ifsp.edu.br", "teste");
		i.save();
		
		Institucional id = new Institucional(1);
		id.delete();
	}
	
	public static void main(String[] args) {
			TesteInstitucional ins = new TesteInstitucional();
	}

}
