package br.com.std.model.business;

import java.io.Serializable;

public class Login extends PessoaBean implements Serializable{
	private static final long serialVersionUID = 1L;

	private long id;
	private String usuario;
	private String senha;
	private String perfil;
	
	public Login(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	

}
