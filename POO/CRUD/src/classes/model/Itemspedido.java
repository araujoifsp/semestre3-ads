package classes.model;


import java.util.Arrays;
import java.sql.Date;
import java.sql.ResultSet;

import classes.database.DBQuery;
import classes.multitools.Utilities;

public class Itemspedido {

	private int idItemPedido;
	private int ordem;
	private int idPedido;
	private int idEstoque;
	private int qtdItem;
	private Date dtDevolucao;
	private String motivoDevolucao;
	
	private String tableName  = "lojinha.itemspedido"; 
	private String fieldsName = "idItemPedido,ordem,idPedido,idEstoque,qtdItem,dtDevolucao,motivoDevolucao";
	private String fieldKey   = "idItemPedido";
	private DBQuery dbQuery   = new DBQuery(tableName, fieldsName, fieldKey);
	
	private Utilities utilities = new Utilities();
	
	public int save() {
		if ( this.getIditempedido() > 0) {
			return(this.dbQuery.update(this.toArray())) ;
		}else {
			return(this.dbQuery.insert(this.toArray())) ;
		}
		
	}
	
	public int delete ( ) {
		if ( this.getIditempedido() > 0) {
			return(this.dbQuery.delete(this.toArray())) ;
		}else {
			return(0) ;
		}		
	}
	
	public ResultSet listAll() {
		return(this.dbQuery.select(""));
	}
	
	
	 public Itemspedido( int idItemPedido, int ordem, int idPedido, int idEstoque, int qtdItem, Date dtDevolucao, String motivoDevolucao){
		 this.setIditempedido( idItemPedido );
		 this.setOrdem( ordem );
		 this.setIdpedido( idPedido );
		 this.setIdestoque( idEstoque );
		 this.setQtditem( qtdItem );
		 this.setDtdevolucao( dtDevolucao );
		 this.setMotivodevolucao( motivoDevolucao );
	}

	public String[] toArray(){
		 return ( new String[]{
			this.getIditempedido() +"",
			this.getOrdem() +"",
			this.getIdpedido() +"",
			this.getIdestoque() +"",
			this.getQtditem() +"",
			this.getDtdevolucao() +"",
			this.getMotivodevolucao() +""
		});
	}

	public String toString(){
		 return( Arrays.toString(this.toArray()));
	}

	public void setIditempedido( int idItemPedido ){
		 this.idItemPedido = idItemPedido;
	}

	public int getIditempedido(){
		 return( this.idItemPedido);
	}

	public void setOrdem( int ordem ){
		 this.ordem = ordem;
	}

	public String getOrdem(){
		 return( this.ordem +"");
	}

	public void setIdpedido( int idPedido ){
		 this.idPedido = idPedido;
	}

	public String getIdpedido(){
		 return( this.idPedido +"");
	}

	public void setIdestoque( int idEstoque ){
		 this.idEstoque = idEstoque;
	}

	public String getIdestoque(){
		 return( this.idEstoque +"");
	}

	public void setQtditem( int qtdItem ){
		 this.qtdItem = qtdItem;
	}

	public String getQtditem(){
		 return( this.qtdItem +"");
	}

	public void setDtdevolucao( Date dtDevolucao ){
		 this.dtDevolucao = dtDevolucao;
	}

	public String getDtdevolucao(){
		 return( utilities.dateToMySQLDate(this.dtDevolucao ));
	}

	public void setMotivodevolucao( String motivoDevolucao ){
		 this.motivoDevolucao = motivoDevolucao;
	}

	public String getMotivodevolucao(){
		 return( this.motivoDevolucao );
	}

}
