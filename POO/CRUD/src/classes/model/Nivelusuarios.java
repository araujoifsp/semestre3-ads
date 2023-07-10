package classes.model;


import java.sql.ResultSet;
import java.util.Arrays;

import classes.database.DBQuery;

public class Nivelusuarios {

	private int idNivelUsuario;
	private String nivel;
	
	private String tableName  = "lojinha.nivelUsuarios"; 
	private String fieldsName = "idNivelUsuario,nivel";
	private String fieldKey   = "idNivelUsuario";
	private DBQuery dbQuery   = new DBQuery(tableName, fieldsName, fieldKey);
	
	public int save() {
		if ( this.getIdnivelusuario() > 0 ) {
			return(this.dbQuery.update(this.toArray())) ;
		}else {
			return(this.dbQuery.insert(this.toArray())) ;
		}
		
	}
	
	public int delete() {
		if ( this.getIdnivelusuario() > 0) {
			return(this.dbQuery.delete(this.toArray())) ;
		}else {
			return(0) ;
		}		
	}
	
	public ResultSet listAll() {
		return(this.dbQuery.select(""));
	}
	

	 public Nivelusuarios( int idNivelUsuario, String nivel){
		 this.setIdnivelusuario( idNivelUsuario );
		 this.setNivel( nivel );
	}
	 
	public Nivelusuarios(int idNivelUsuario){
		 this.setIdnivelusuario( idNivelUsuario );
		 this.setNivel(nivel);
	}

	public String[] toArray(){
		 return ( new String[]{
			this.getIdnivelusuario() +"",
			this.getNivel() +""
		});
	}

	public String toString(){
		 return( Arrays.toString(this.toArray()));
	}

	public void setIdnivelusuario( int idNivelUsuario ){
		 this.idNivelUsuario = idNivelUsuario;
	}

	public int getIdnivelusuario(){
		 return( this.idNivelUsuario);
	}

	public void setNivel( String nivel ){
		 this.nivel = nivel;
	}

	public String getNivel(){
		 return( this.nivel );
	}

}
