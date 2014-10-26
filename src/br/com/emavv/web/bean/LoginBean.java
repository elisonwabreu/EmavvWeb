package br.com.emavv.web.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.emavv.web.domain.LoginDM;

@ManagedBean(name = "MBLogin")
@ViewScoped
public class LoginBean {
	
	private LoginDM login;
	private LoginDM senha;
	
	
	public LoginDM getLogin() {
		return login;
	}
	public void setLogin(LoginDM login) {
		this.login = login;
	}
	public LoginDM getSenha() {
		return senha;
	}
	public void setSenha(LoginDM senha) {
		this.senha = senha;
	}
	
	public void validadeLogin(){
		
	}	
	
}
