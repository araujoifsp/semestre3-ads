package classes.model;


import java.sql.ResultSet;
import java.util.Arrays;

import classes.database.DBQuery;

public class Usuarios {

	private int idUsuario;
	private String email;
	private String senha;
	private int idNivelUsuario;
	private String nome;
	private String cpf;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String telefone;
	private String foto;
	private String ativo;
	
	private String tableName  = "lojinha.usuarios"; 
	private String fieldsName = "idUsuario,email,senha,idNivelUsuario,nome,cpf,endereco,bairro,cidade,uf,cep,telefone,foto,ativo";
	private String fieldKey   = "idUsuario";
	private DBQuery dbQuery   = new DBQuery(tableName, fieldsName, fieldKey);

	public int save() {
		if ( this.getIdusuario() > 0 ) {
			return(this.dbQuery.update(this.toArray())) ;
		}else {
			return(this.dbQuery.insert(this.toArray())) ;
		}
		
	}
	
	public int delete ( ) {
		if ( this.getIdusuario() > 0 ) {
			return(this.dbQuery.delete(this.toArray())) ;
		}else {
			return(0);
		}		
	}
	
	public ResultSet listAll() {
		return(this.dbQuery.select(""));
	}
	
	
	 public Usuarios( int idUsuario, String email, String senha, int idNivelUsuario, String nome, String cpf, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String foto, String ativo){
		 this.setIdusuario( idUsuario );
		 this.setEmail( email );
		 this.setSenha( senha );
		 this.setIdnivelusuario( idNivelUsuario );
		 this.setNome( nome );
		 this.setCpf( cpf );
		 this.setEndereco( endereco );
		 this.setBairro( bairro );
		 this.setCidade( cidade );
		 this.setUf( uf );
		 this.setCep( cep );
		 this.setTelefone( telefone );
		 this.setFoto( foto );
		 this.setAtivo( ativo );
	}
	 
	 public Usuarios(int idUsuario) {
		 this.setIdusuario( idUsuario );
	 }

	public String[] toArray(){
		 return ( new String[]{
			this.getIdusuario() +"",
			this.getEmail() +"",
			this.getSenha() +"",
			this.getIdnivelusuario() +"",
			this.getNome() +"",
			this.getCpf() +"",
			this.getEndereco() +"",
			this.getBairro() +"",
			this.getCidade() +"",
			this.getUf() +"",
			this.getCep() +"",
			this.getTelefone() +"",
			this.getFoto() +"",
			this.getAtivo() +""
		});
	}

	public String toString(){
		 return( Arrays.toString(this.toArray()));
	}

	public void setIdusuario( int idUsuario ){
		 this.idUsuario = idUsuario;
	}

	public int getIdusuario(){
		 return( this.idUsuario );
	}

	public void setEmail( String email ){
		 this.email = email;
	}

	public String getEmail(){
		 return( this.email );
	}

	public void setSenha( String senha ){
		 this.senha = senha;
	}

	public String getSenha(){
		 return( this.senha );
	}

	public void setIdnivelusuario( int idNivelUsuario ){
		 this.idNivelUsuario = idNivelUsuario;
	}

	public String getIdnivelusuario(){
		 return( this.idNivelUsuario +"");
	}

	public void setNome( String nome ){
		 this.nome = nome;
	}

	public String getNome(){
		 return( this.nome );
	}

	public void setCpf( String cpf ){
		 this.cpf = cpf;
	}

	public String getCpf(){
		 return( this.cpf );
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

	public void setFoto( String foto ){
		 this.foto = foto;
	}

	public String getFoto(){
		 return( this.foto );
	}

	public void setAtivo( String ativo ){
		 this.ativo = ativo;
	}

	public String getAtivo(){
		 return( this.ativo );
	}

}
