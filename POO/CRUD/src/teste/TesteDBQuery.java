package teste;

import java.sql.ResultSet;
import java.sql.SQLException;

import classes.database.DBQuery;

public class TesteDBQuery {
	
	public static void main(String[] args) {
		
		DBQuery dbQuery = new DBQuery("lojinha.usuarios", "idUsuario,email,senha,idNivelUsuario,nome,cpf,endereco,bairro,cidade,uf,cep,telefone,foto,ativo", "idUsuario");
		ResultSet rs = dbQuery.select("");
		String outStr = "";
		try {
			while ( rs.next() ) {
					outStr += rs.getString("idUsuario") + " | ";
					outStr += rs.getString("email") + " | ";
					outStr += rs.getString("senha") + " | ";
					outStr += rs.getString("idNivelUsuario") + " | ";
					outStr += rs.getString("nome") + " | ";
					outStr += rs.getString("cpf") + " | ";
					outStr += rs.getString("endereco") + " | ";
					outStr += rs.getString("bairro") + " | ";
					outStr += rs.getString("cidade") + " | ";
					outStr += rs.getString("uf") + " | ";
					outStr += rs.getString("cep") + " | ";
					outStr += rs.getString("telefone") + " | ";
					outStr += rs.getString("foto") + " | ";
					outStr += rs.getString("ativo") + " \n ";
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(outStr);
		
	}

}
