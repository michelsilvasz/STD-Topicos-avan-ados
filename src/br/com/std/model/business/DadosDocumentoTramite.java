package br.com.std.model.business;

import java.io.Serializable;

public class DadosDocumentoTramite  implements Serializable{
	private static final long serialVersionUID = 1L;
   private String descricao;
   private String tipo;
   private String nomeDocumento;
   private String centroCusto;
   private String destinatario;
   private String dataTramite;
   private int idTramite;
   private int idBusca;
   
   public int getIdBusca() {
	return idBusca;
}
public void setIdBusca(int idBusca) {
	this.idBusca = idBusca;
}
public void setIdTramite(int idTramite) {
	this.idTramite = idTramite;
}
public Integer getIdTramite() {
		return idTramite;
	}
	public void setIdTramite(Integer idTramite) {
		this.idTramite = idTramite;
	}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getNomeDocumento() {
	return nomeDocumento;
}
public void setNomeDocumento(String nomeDocumento) {
	this.nomeDocumento = nomeDocumento;
}
public String getCentroCusto() {
	return centroCusto;
}
public void setCentroCusto(String centroCusto) {
	this.centroCusto = centroCusto;
}
public String getDestinatario() {
	return destinatario;
}
public void setDestinatario(String destinatario) {
	this.destinatario = destinatario;
}
public String getDataTramite() {
	return dataTramite;
}
public void setDataTramite(String dataTramite) {
	this.dataTramite = dataTramite;
}
   
}
