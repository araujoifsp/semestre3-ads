package classes.model;


import java.sql.ResultSet;
import java.util.Arrays;

import classes.database.DBQuery;

public class Estoque {

	private int idEstoque;
	private int idProduto;
	private String dtEntrada;
	private int quantidade;
	private String dtFabricacao;
	private String dtVencimento;
	private String nfCompra;
	private double precoCompra;
	private double icmsCompra;
	private double precoVenda;
	private int qtdVendida;
	private int qtdOcorrencia;
	private String ocorrencia;
	
	private String tableName  = "lojinha.estoque"; 
	private String fieldsName = "idEstoque,idProduto,dtEntrada,quantidade,dtFabricacao,dtVencimento,nfCompra,precoCompra,icmsCompra,precoVenda,qtdVendida,qtdOcorrencia,ocorrencia";
	private String fieldKey   = "idEstoque";
	private DBQuery dbQuery   = new DBQuery(tableName, fieldsName, fieldKey);
	
	public int save() {
		if ( this.getIdestoque() > 0 ) {
			return(this.dbQuery.update(this.toArray())) ;
		}else {
			return(this.dbQuery.insert(this.toArray())) ;
		}
		
	}
	
	public int delete ( ) {
		if ( this.getIdestoque() > 0) {
			return(this.dbQuery.delete(this.toArray())) ;
		}else {
			return(0) ;
		}		
	}
	
	public ResultSet listAll() {
		return(this.dbQuery.select(""));
	}


	 public Estoque( int idEstoque, int idProduto, String dtEntrada, int quantidade, String dtFabricacao, String dtVencimento, String nfCompra, double precoCompra, double icmsCompra, double precoVenda, int qtdVendida, int qtdOcorrencia, String ocorrencia){
		 this.setIdestoque( idEstoque );
		 this.setIdproduto( idProduto );
		 this.setDtentrada( dtEntrada );
		 this.setQuantidade( quantidade );
		 this.setDtfabricacao( dtFabricacao );
		 this.setDtvencimento( dtVencimento );
		 this.setNfcompra( nfCompra );
		 this.setPrecocompra( precoCompra );
		 this.setIcmscompra( icmsCompra );
		 this.setPrecovenda( precoVenda );
		 this.setQtdvendida( qtdVendida );
		 this.setQtdocorrencia( qtdOcorrencia );
		 this.setOcorrencia( ocorrencia );
	}

	public String[] toArray(){
		 return ( new String[]{
			this.getIdestoque() +"",
			this.getIdproduto() +"",
			this.getDtentrada() +"",
			this.getQuantidade() +"",
			this.getDtfabricacao() +"",
			this.getDtvencimento() +"",
			this.getNfcompra() +"",
			this.getPrecocompra() +"",
			this.getIcmscompra() +"",
			this.getPrecovenda() +"",
			this.getQtdvendida() +"",
			this.getQtdocorrencia() +"",
			this.getOcorrencia() +""
		});
	}

	public String toString(){
		 return( Arrays.toString(this.toArray()));
	}

	public void setIdestoque( int idEstoque ){
		 this.idEstoque = idEstoque;
	}

	public int getIdestoque(){
		 return( this.idEstoque);
	}

	public void setIdproduto( int idProduto ){
		 this.idProduto = idProduto;
	}

	public String getIdproduto(){
		 return( this.idProduto+"" );
	}

	public void setDtentrada( String dtEntrada ){
		 this.dtEntrada = dtEntrada;
	}

	public String getDtentrada(){
		 return( this.dtEntrada );
	}

	public void setQuantidade( int quantidade ){
		 this.quantidade = quantidade;
	}

	public String getQuantidade(){
		 return( this.quantidade +"");
	}

	public void setDtfabricacao( String dtFabricacao ){
		 this.dtFabricacao = dtFabricacao;
	}

	public String getDtfabricacao(){
		 return( this.dtFabricacao );
	}

	public void setDtvencimento( String dtVencimento ){
		 this.dtVencimento = dtVencimento;
	}

	public String getDtvencimento(){
		 return( this.dtVencimento );
	}

	public void setNfcompra( String nfCompra ){
		 this.nfCompra = nfCompra;
	}

	public String getNfcompra(){
		 return( this.nfCompra );
	}

	public void setPrecocompra( double precoCompra ){
		 this.precoCompra = precoCompra;
	}

	public String getPrecocompra(){
		 return( this.precoCompra +"" );
	}

	public void setIcmscompra( double icmsCompra ){
		 this.icmsCompra = icmsCompra;
	}

	public String getIcmscompra(){
		 return( this.icmsCompra +"" );
	}

	public void setPrecovenda( double precoVenda ){
		 this.precoVenda = precoVenda;
	}

	public String getPrecovenda(){
		 return( this.precoVenda +"");
	}

	public void setQtdvendida( int qtdVendida ){
		 this.qtdVendida = qtdVendida;
	}

	public String getQtdvendida(){
		 return( this.qtdVendida +"");
	}

	public void setQtdocorrencia( int qtdOcorrencia ){
		 this.qtdOcorrencia = qtdOcorrencia;
	}

	public String getQtdocorrencia(){
		 return( this.qtdOcorrencia +"" );
	}

	public void setOcorrencia( String ocorrencia ){
		 this.ocorrencia = ocorrencia;
	}

	public String getOcorrencia(){
		 return( this.ocorrencia );
	}

}
