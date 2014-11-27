package br.com.emavv.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuarios")
public class UsuarioDM {
	
	@Id
	@Column(name = "fd_funcionario")
	private int id;
	@Column(name = "fd_login")
	private String login;
	@Column(name = "fd_senha")
	private String senha;
	@Column(name = "fd_status")
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
