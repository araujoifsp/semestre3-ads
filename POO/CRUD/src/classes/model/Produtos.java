package classes.model;


import java.sql.ResultSet;
import java.util.Arrays;

import classes.database.DBQuery;

public class Produtos {

	private int idProduto;
	private String fabricante;
	private String nome;
	private String marca;
	private String modelo;
	private int idCategoria;
	private String descricao;
	private String unidadeMedida;
	private double largura;
	private double altura;
	private double profundidade;
	private double peso;
	private String cor;
	
	private String tableName  = "lojinha.produtos"; 
	private String fieldsName = "idProduto,fabricante,nome,marca,modelo,idCategoria,descricao,unidadeMedida,largura,altura,profundidade,peso,cor";
	private String fieldKey   = "idProduto";
	private DBQuery dbQuery   = new DBQuery(tableName, fieldsName, fieldKey);
	
	public int save() {
		if ( this.getIdproduto() > 0 ) {
			return(this.dbQuery.update(this.toArray())) ;
		}else {
			return(this.dbQuery.insert(this.toArray())) ;
		}
		
	}
	
	public int delete ( ) {
		if ( this.getIdproduto() > 0 ) {
			return(this.dbQuery.delete(this.toArray())) ;
		}else {
			return(0) ;
		}		
	}
	
	public ResultSet listAll() {
		return(this.dbQuery.select(""));
	}
	
	

	 public Produtos( int idProduto, String fabricante, String nome, String marca, String modelo, int idCategoria, String descricao, String unidadeMedida, double largura, double altura, double profundidade, double peso, String cor){
		 this.setIdproduto( idProduto );
		 this.setFabricante( fabricante );
		 this.setNome( nome );
		 this.setMarca( marca );
		 this.setModelo( modelo );
		 this.setIdcategoria( idCategoria );
		 this.setDescricao( descricao );
		 this.setUnidademedida( unidadeMedida );
		 this.setLargura( largura );
		 this.setAltura( altura );
		 this.setProfundidade( profundidade );
		 this.setPeso( peso );
		 this.setCor( cor );
	}
	 
	 public Produtos(int idProduto) {
		 this.setIdproduto( idProduto );
	 }

	public String[] toArray(){
		 return ( new String[]{
			this.getIdproduto() +"",
			this.getFabricante() +"",
			this.getNome() +"",
			this.getMarca() +"",
			this.getModelo() +"",
			this.getIdcategoria() +"",
			this.getDescricao() +"",
			this.getUnidademedida() +"",
			this.getLargura() +"",
			this.getAltura() +"",
			this.getProfundidade() +"",
			this.getPeso() +"",
			this.getCor() +""
		});
	}

	public String toString(){
		 return( Arrays.toString(this.toArray()));
	}

	public void setIdproduto( int idProduto ){
		 this.idProduto = idProduto;
	}

	public int getIdproduto(){
		 return(this.idProduto);
	}

	public void setFabricante( String fabricante ){
		 this.fabricante = fabricante;
	}

	public String getFabricante(){
		 return( this.fabricante );
	}

	public void setNome( String nome ){
		 this.nome = nome;
	}

	public String getNome(){
		 return( this.nome );
	}

	public void setMarca( String marca ){
		 this.marca = marca;
	}

	public String getMarca(){
		 return( this.marca );
	}

	public void setModelo( String modelo ){
		 this.modelo = modelo;
	}

	public String getModelo(){
		 return( this.modelo );
	}

	public void setIdcategoria( int idCategoria ){
		 this.idCategoria = idCategoria;
	}

	public String getIdcategoria(){
		 return( this.idCategoria +"");
	}

	public void setDescricao( String descricao ){
		 this.descricao = descricao;
	}

	public String getDescricao(){
		 return( this.descricao );
	}

	public void setUnidademedida( String unidadeMedida ){
		 this.unidadeMedida = unidadeMedida;
	}

	public String getUnidademedida(){
		 return( this.unidadeMedida );
	}

	public void setLargura( double largura ){
		 this.largura = largura;
	}

	public String getLargura(){
		 return( this.largura +"");
	}

	public void setAltura( double altura ){
		 this.altura = altura;
	}

	public String getAltura(){
		 return( this.altura +"");
	}

	public void setProfundidade( double profundidade ){
		 this.profundidade = profundidade;
	}

	public String getProfundidade(){
		 return( this.profundidade +"");
	}

	public void setPeso( double peso ){
		 this.peso = peso;
	}

	public String getPeso(){
		 return( this.peso +"");
	}

	public void setCor( String cor ){
		 this.cor = cor;
	}

	public String getCor(){
		 return( this.cor );
	}

}
