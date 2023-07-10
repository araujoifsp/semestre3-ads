package teste;

import java.net.ConnectException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import classes.database.DBConnection;

public class TesteDBConnection {
	
	public static void main(String[] args) {
		DBConnection conn = new DBConnection("localhost", "3306", "lojinha","root", "");
		
		Statement st;
		try {
			st = conn.getConnection().createStatement();
			String sql = "SELECT idUsuario,email,senha,idNivelUsuario,nome,cpf,endereco,bairro,cidade,uf,cep,telefone,foto,ativo FROM lojinha.usuarios;";		
			ResultSet rs = st.executeQuery(sql);
			String outStr = "";
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
			System.out.println(outStr);
 			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

}
