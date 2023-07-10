package classes.model;


import java.sql.ResultSet;
import java.util.Arrays;

import classes.database.DBQuery;

public class Categorias {

	private int idCategoria;
	private String descricao;
	
	private String tableName  = "lojinha.categorias"; 
	private String fieldsName = "idCategoria,descricao";
	private String fieldKey   = "idCategoria";
	private DBQuery dbQuery   = new DBQuery(tableName, fieldsName, fieldKey);
	
	public int save() {
		if ( this.getIdcategoria() > 0) {
			return(this.dbQuery.update(this.toArray())) ;
		}else {
			return(this.dbQuery.insert(this.toArray())) ;
		}
		
	}
	
	public int delete ( ) {
		if ( this.getIdcategoria() > 0) {
			return(this.dbQuery.delete(this.toArray())) ;
		}else {
			return(0) ;
		}		
	}
	
	public ResultSet listAll() {
		return(this.dbQuery.select(""));
	}


	 public Categorias( int idCategoria, String descricao){
		 this.setIdcategoria( idCategoria );
		 this.setDescricao( descricao );
	}
	 
	public Categorias( int idCategoria){
		 this.setIdcategoria( idCategoria );
	}

	public String[] toArray(){
		 return ( new String[]{
			this.getIdcategoria() +"",
			this.getDescricao() +""
		});
	}

	public String toString(){
		 return( Arrays.toString(this.toArray()));
	}

	public void setIdcategoria( int idCategoria ){
		 this.idCategoria = idCategoria;
	}

	public int getIdcategoria(){
		 return( this.idCategoria);
	}

	public void setDescricao( String descricao ){
		 this.descricao = descricao;
	}

	public String getDescricao(){
		 return( this.descricao );
	}

}
