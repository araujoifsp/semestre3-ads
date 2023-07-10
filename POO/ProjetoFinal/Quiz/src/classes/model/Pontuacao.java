package classes.model;


import java.sql.ResultSet;
import java.util.Arrays;
import classes.database.DBQuery;

public class Pontuacao {

	private int id;
	private String nome_jogador;
	private char q1;
	private char q2;
	private char q3;
	private char q4;
	private int total;

	private String tableName  = "quiz.pontuacao"; 
	private String fieldsName = "id,nome_jogador,q1,q2,q3,q4,total";
	private String fieldKey   = "id";
	public DBQuery dbQuery   = new DBQuery(tableName, fieldsName, fieldKey);
	

	public int save() {
		if ( this.getId() > 0) {
			return(this.dbQuery.update(this.toArray())) ;
		}else {
			return(this.dbQuery.insert(this.toArray())) ;
		}
		
	}
	
	public int delete ( ) {
		if ( this.getId() > 0) {
			return(this.dbQuery.delete(this.toArray())) ;
		}else {
			return(0) ;
		}		
	}
	
	public ResultSet listAll() {
		return(this.dbQuery.select("0 = 0 Order By total desc"));
	}
	
	public Pontuacao(int id, String nome_jogaor, char q1, char q2, char q3, char q4, int total){
		 this.setId(id);
		 this.setNome_jogador(nome_jogaor);
		 this.setQ1(q1);
		 this.setQ2(q2);
		 this.setQ3(q3);
		 this.setQ4(q4);
		 this.setTotal(total);
	}
	 
	public Pontuacao( int id){
		 this.setId(id);
	}

	public String[] toArray(){
		 return ( new String[]{
			this.getId() +"",
			this.getNome_jogador() +"",
			this.getQ1() +"",
			this.getQ2() +"",
			this.getQ3() +"",
			this.getQ4() +"",
			this.getTotal() + ""
		});
	}

	public String toString(){
		 return( Arrays.toString(this.toArray()));
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_jogador() {
		return nome_jogador;
	}

	public void setNome_jogador(String nome_jogador) {
		this.nome_jogador = nome_jogador;
	}

	public char getQ1() {
		return q1;
	}

	public void setQ1(char q1) {
		this.q1 = q1;
	}

	public char getQ2() {
		return q2;
	}

	public void setQ2(char q2) {
		this.q2 = q2;
	}

	public char getQ3() {
		return q3;
	}

	public void setQ3(char q3) {
		this.q3 = q3;
	}

	public char getQ4() {
		return q4;
	}

	public void setQ4(char q4) {
		this.q4 = q4;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
}
