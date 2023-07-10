package classes.model;


import java.sql.ResultSet;
import java.util.Arrays;

import classes.database.DBQuery;

public class Jogador {
	
	private int id;
	private String nome;
	
	private String tableName  = "quiz.jogadores"; 
	private String fieldsName = "id,nome";
	private String fieldKey   = "id";
	private DBQuery dbQuery   = new DBQuery(tableName, fieldsName, fieldKey);
	

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
		return(this.dbQuery.select(""));
	}

	
	public Jogador( int id, String nome){
		 this.setId(id);
		 this.setNome(nome);
	}
	 
	public Jogador( int id){
		 this.setId(id);
	}

	public String[] toArray(){
		 return ( new String[]{
			this.getId() +"",
			this.getNome() +""
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
