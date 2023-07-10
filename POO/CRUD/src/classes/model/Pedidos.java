package classes.model;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.Arrays;

import classes.database.DBQuery;
import classes.multitools.Utilities;

public class Pedidos {

	private int idPedido;
	private int idUsuario;
	private Date dtPedido;
	private Date dtPagamento;
	private Date dtNotaFiscal;
	private String notaFiscal;
	private Date dtEnvio;
	private Date dtRecebimento;
	private int tipoFrete;
	private String rastreioFrete;
	private String entregaendereco;
	private String entregaNumero;
	private String entregaCompl;
	private String entregaBairro;
	private String entregaCidade;
	private String entregaUF;
	private String entregaCEP;
	private String entregaTelefone;
	private String entregaRefer;
	private double valorTotal;
	private int qtdItems;
	private Date dtDevolucao;
	private String motivoDevolucao;
	
	private String tableName  = "lojinha.pedidos"; 
	private String fieldsName = "idPedido,idUsuario,dtPedido,dtPagamento,dtNotaFiscal,notaFiscal,dtEnvio,dtRecebimento,tipoFrete,rastreioFrete,entregaendereco,entregaNumero,entregaCompl,entregaBairro,entregaCidade,entregaUF,entregaCEP,entregaTelefone,entregaRefer,valorTotal,qtdItemsdtDevolucao,motivoDevolucao";
	private String fieldKey   = "idPedido";
	private DBQuery dbQuery   = new DBQuery(tableName, fieldsName, fieldKey);
	
	private Utilities utilities = new Utilities();
	
	public int save() {
		if ( this.getIdpedido() > 0 ) {
			return(this.dbQuery.update(this.toArray())) ;
		}else {
			return(this.dbQuery.insert(this.toArray())) ;
		}
		
	}
	
	public int delete ( ) {
		if ( this.getIdpedido() > 0) {
			return(this.dbQuery.delete(this.toArray())) ;
		}else {
			return(0) ;
		}		
	}
	
	public ResultSet listAll() {
		return(this.dbQuery.select(""));
	}
	

	public Pedidos(int idPedido, int idUsuario, Date dtPedido, Date dtPagamento, Date dtNotaFiscal, String notaFiscal,
			Date dtEnvio, Date dtRecebimento, int tipoFrete, String rastreioFrete, String entregaendereco,
			String entregaNumero, String entregaCompl, String entregaBairro, String entregaCidade, String entregaUF,
			String entregaCEP, String entregaTelefone, String entregaRefer, double valorTotal, int qtdItems,
			Date dtDevolucao, String motivoDevolucao) {
		this.setIdpedido(idPedido);
		this.setIdusuario(idUsuario);
		this.setDtpedido(dtPedido);
		this.setDtpagamento(dtPagamento);
		this.setDtnotafiscal(dtNotaFiscal);
		this.setNotafiscal(notaFiscal);
		this.setDtenvio(dtEnvio);
		this.setDtrecebimento(dtRecebimento);
		this.setTipofrete(tipoFrete);
		this.setRastreiofrete(rastreioFrete);
		this.setEntregaendereco(entregaendereco);
		this.setEntreganumero(entregaNumero);
		this.setEntregacompl(entregaCompl);
		this.setEntregabairro(entregaBairro);
		this.setEntregacidade(entregaCidade);
		this.setEntregauf(entregaUF);
		this.setEntregacep(entregaCEP);
		this.setEntregatelefone(entregaTelefone);
		this.setEntregarefer(entregaRefer);
		this.setValortotal(valorTotal);
		this.setQtditems(qtdItems);
		this.setDtdevolucao(dtDevolucao);
		this.setMotivodevolucao(motivoDevolucao);
	}
	
	public Pedidos(int idPedido){
		this.setIdpedido(idPedido);
	}
	

	public String[] toArray() {
		return (new String[] { this.getIdpedido() + "", this.getIdusuario() + "", this.getDtpedido() + "",
				this.getDtpagamento() + "", this.getDtnotafiscal() + "", this.getNotafiscal() + "",
				this.getDtenvio() + "", this.getDtrecebimento() + "", this.getTipofrete() + "",
				this.getRastreiofrete() + "", this.getEntregaendereco() + "", this.getEntreganumero() + "",
				this.getEntregacompl() + "", this.getEntregabairro() + "", this.getEntregacidade() + "",
				this.getEntregauf() + "", this.getEntregacep() + "", this.getEntregatelefone() + "",
				this.getEntregarefer() + "", this.getValortotal() + "", this.getQtditems() + "",
				this.getDtdevolucao() + "", this.getMotivodevolucao() + "" });
	}

	public String toString() {
		return (Arrays.toString(this.toArray()));
	}

	public void setIdpedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdpedido() {
		return (this.idPedido);
	}

	public void setIdusuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getIdusuario() {
		return (this.idUsuario + "");
	}

	public void setDtpedido(Date dtPedido) {
		this.dtPedido = dtPedido;
	}


	public void setDtpagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}
	
	public String getDtpedido() {
		return (utilities.dateToMySQLDate(this.dtPedido));
	}

	public Date getDtpedidoPtBr() {
		return (this.dtPedido);
	}
	public String getDtpagamento() {
		return ( utilities.dateToMySQLDate(this.dtPagamento));
	}

	public void setDtnotafiscal(Date dtNotaFiscal) {
		this.dtNotaFiscal = dtNotaFiscal;
	}

	public String getDtnotafiscal() {
		return (utilities.dateToMySQLDate(this.dtNotaFiscal));
	}

	public void setNotafiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public String getNotafiscal() {
		return (this.notaFiscal);
	}

	public void setDtenvio(Date dtEnvio) {
		this.dtEnvio = dtEnvio;
	}

	public String getDtenvio() {
		return ( utilities.dateToMySQLDate(this.dtEnvio));
	}

	public void setDtrecebimento(Date dtRecebimento) {
		this.dtRecebimento = dtRecebimento;
	}

	public String getDtrecebimento() {
		return (utilities.dateToMySQLDate(this.dtRecebimento));
	}

	public void setTipofrete(int tipoFrete) {
		this.tipoFrete = tipoFrete;
	}

	public String getTipofrete() {
		return (this.tipoFrete + "");
	}

	public void setRastreiofrete(String rastreioFrete) {
		this.rastreioFrete = rastreioFrete;
	}

	public String getRastreiofrete() {
		return (this.rastreioFrete);
	}

	public void setEntregaendereco(String entregaendereco) {
		this.entregaendereco = entregaendereco;
	}

	public String getEntregaendereco() {
		return (this.entregaendereco);
	}

	public void setEntreganumero(String entregaNumero) {
		this.entregaNumero = entregaNumero;
	}

	public String getEntreganumero() {
		return (this.entregaNumero);
	}

	public void setEntregacompl(String entregaCompl) {
		this.entregaCompl = entregaCompl;
	}

	public String getEntregacompl() {
		return (this.entregaCompl);
	}

	public void setEntregabairro(String entregaBairro) {
		this.entregaBairro = entregaBairro;
	}

	public String getEntregabairro() {
		return (this.entregaBairro);
	}

	public void setEntregacidade(String entregaCidade) {
		this.entregaCidade = entregaCidade;
	}

	public String getEntregacidade() {
		return (this.entregaCidade);
	}

	public void setEntregauf(String entregaUF) {
		this.entregaUF = entregaUF;
	}

	public String getEntregauf() {
		return (this.entregaUF);
	}

	public void setEntregacep(String entregaCEP) {
		this.entregaCEP = entregaCEP;
	}

	public String getEntregacep() {
		return (this.entregaCEP);
	}

	public void setEntregatelefone(String entregaTelefone) {
		this.entregaTelefone = entregaTelefone;
	}

	public String getEntregatelefone() {
		return (this.entregaTelefone);
	}

	public void setEntregarefer(String entregaRefer) {
		this.entregaRefer = entregaRefer;
	}

	public String getEntregarefer() {
		return (this.entregaRefer);
	}

	public void setValortotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getValortotal() {
		return (this.valorTotal+"");
	}

	public void setQtditems(int qtdItems) {
		this.qtdItems = qtdItems;
	}

	public String getQtditems() {
		return (this.qtdItems+"");
	}

	public void setDtdevolucao(Date dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}

	public String getDtdevolucao() {
		return (utilities.dateToMySQLDate(this.dtDevolucao));
	}

	public void setMotivodevolucao(String motivoDevolucao) {
		this.motivoDevolucao = motivoDevolucao;
	}

	public String getMotivodevolucao() {
		return (this.motivoDevolucao);
	}

}
