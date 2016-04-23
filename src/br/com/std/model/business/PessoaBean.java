package br.com.std.model.business;

import java.io.Serializable;
import java.util.Date;

public class PessoaBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	private String sobrenome;
	private Date dataNasc;
	private String email;
		
	public PessoaBean(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
