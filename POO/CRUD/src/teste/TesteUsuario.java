package teste;

import classes.model.Usuarios;

public class TesteUsuario {

	public TesteUsuario() {
		Usuarios usuario = new Usuarios(0, "teste1", "Teste",1, "gabriel", "000.000.000-02", "rua lidice 22", "pq novo mundo", "sao paulo", "sp", "00000-000", "40028923", "teste.png", "S");
		// Ajustar valores de entrada do "new Usuarios" para não dar erros de dependencia como chave estrangeira ou NOT NULL
		usuario.save();
		
		Usuarios usu = new Usuarios(17);
		usu.delete();
	}
	
	public static void main(String[] args) {
		TesteUsuario u = new TesteUsuario();
	}
	
}
