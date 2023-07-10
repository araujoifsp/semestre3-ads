package classes.model;


import java.sql.ResultSet;
import java.util.Arrays;

import classes.database.DBQuery;

public class Institucional {

	private int idInstituicao;
	private String nome;
	private String cpf_cnpj;
	private char tipoPessoa;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String telefone;
	private String email;
	private String logo;
	
	private String tableName  = "lojinha.institucional"; 
	private String fieldsName = "idInstituicao,nome,cpf_cnpj,tipoPessoa,endereco,bairro,cidade,uf,cep,telefone,email,logo";
	private String fieldKey   = "idInstituicao";
	private DBQuery dbQuery   = new DBQuery(tableName, fieldsName, fieldKey);
	
	public int save() {
		if ( this.getIdinstituicao() > 0 ) {
			return(this.dbQuery.update(this.toArray())) ;
		}else {
			return(this.dbQuery.insert(this.toArray())) ;
		}
		
	}
	
	public int delete ( ) {
		if ( this.getIdinstituicao() > 0) {
			return(this.dbQuery.delete(this.toArray())) ;
		}else {
			return(0) ;
		}		
	}
	
	public ResultSet listAll() {
		return(this.dbQuery.select(""));
	}

	 public Institucional( int idInstituicao, String nome, String cpf_cnpj, char tipoPessoa, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String email, String logo){
		 this.setIdinstituicao( idInstituicao );
		 this.setNome( nome );
		 this.setCpf_cnpj( cpf_cnpj );
		 this.setTipopessoa( tipoPessoa );
		 this.setEndereco( endereco );
		 this.setBairro( bairro );
		 this.setCidade( cidade );
		 this.setUf( uf );
		 this.setCep( cep );
		 this.setTelefone( telefone );
		 this.setEmail( email );
		 this.setLogo( logo );
	}
	 
	 public Institucional(int idInstituicao){
		 this.setIdinstituicao( idInstituicao );
	 }

	public String[] toArray(){
		 return ( new String[]{
			this.getIdinstituicao() +"",
			this.getNome() +"",
			this.getCpf_cnpj() +"",
			this.getTipopessoa() +"",
			this.getEndereco() +"",
			this.getBairro() +"",
			this.getCidade() +"",
			this.getUf() +"",
			this.getCep() +"",
			this.getTelefone() +"",
			this.getEmail() +"",
			this.getLogo() +""
		});
	}

	public String toString(){
		 return( Arrays.toString(this.toArray()));
	}

	public void setIdinstituicao( int idInstituicao ){
		 this.idInstituicao = idInstituicao;
	}

	public int getIdinstituicao(){
		 return( this.idInstituicao);
	}

	public void setNome( String nome ){
		 this.nome = nome;
	}

	public String getNome(){
		 return( this.nome );
	}

	public void setCpf_cnpj( String cpf_cnpj ){
		 this.cpf_cnpj = cpf_cnpj;
	}

	public String getCpf_cnpj(){
		 return( this.cpf_cnpj );
	}

	public void setTipopessoa( char tipoPessoa ){
		 this.tipoPessoa = tipoPessoa;
	}

	public char getTipopessoa(){
		 return( this.tipoPessoa );
	}

	public void setEndereco( String endereco ){
		 this.endereco = endereco;
	}

	public String getEndereco(){
		 return( this.endereco );
	}

	public void setBairro( String bairro ){
		 this.bairro = bairro;
	}

	public String getBairro(){
		 return( this.bairro );
	}

	public void setCidade( String cidade ){
		 this.cidade = cidade;
	}

	public String getCidade(){
		 return( this.cidade );
	}

	public void setUf( String uf ){
		 this.uf = uf;
	}

	public String getUf(){
		 return( this.uf );
	}

	public void setCep( String cep ){
		 this.cep = cep;
	}

	public String getCep(){
		 return( this.cep );
	}

	public void setTelefone( String telefone ){
		 this.telefone = telefone;
	}

	public String getTelefone(){
		 return( this.telefone );
	}

	public void setEmail( String email ){
		 this.email = email;
	}

	public String getEmail(){
		 return( this.email );
	}

	public void setLogo( String logo ){
		 this.logo = logo;
	}

	public String getLogo(){
		 return( this.logo );
	}

}
