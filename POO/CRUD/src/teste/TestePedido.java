package teste;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import classes.model.Pedidos;

public class TestePedido {

	public TestePedido() {
		
		Pedidos p = new Pedidos(0, 1, dataAtual, dataAtual, dataAtual, "Teste", dataAtual, dataAtual, 1, "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "TEste", "Teste", 1.1, 2, dataAtual, "Teste");
				
		p.save();
		/*
		Pedidos pdeleta = new Pedidos(0);
		pdeleta.delete();
		*/
	}
	
	public static void main(String[] args) {
		TestePedido tp = new TestePedido();
	}

}
