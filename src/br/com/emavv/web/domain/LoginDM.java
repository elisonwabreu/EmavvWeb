package br.com.emavv.web.domain;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginDM {
	
	
	@NotEmpty(message="O Campo Usu�rio � obrigat�rio.")
	private String login;
	@NotEmpty(message="O Campo Usu�rio � obrigat�rio.")
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
