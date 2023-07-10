package teste;

import classes.database.DBConnection;

public class TesteDBConnetion2 {
	
	public TesteDBConnetion2() {
		
		DBConnection dbConnection1 = new DBConnection();
		DBConnection dbConnection2 = new DBConnection("localhost", "3306","lojinha", "root", "");
	}

}
