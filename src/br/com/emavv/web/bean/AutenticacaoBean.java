package br.com.emavv.web.bean;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

import br.com.emavv.web.dao.UsuarioDao;
import br.com.emavv.web.domain.UsuarioDM;
import br.com.emavv.web.util.JSFUtil;

@ManagedBean
@ViewScoped
public class AutenticacaoBean {
	/*
	@EJB
	private UsuarioDao usuario;
	private String login;
	private String senha;
	
	
	
	public UsuarioDao getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDao usuario) {
		this.usuario = usuario;
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
	
		
	public void autenticarUsuario(){
		RequestContext context = RequestContext.getCurrentInstance();
		boolean loggedIn = false;
		usuario = new UsuarioDao();
		List<UsuarioDM> usuList;
		try {
			usuList = usuario.Select(this.login, this.senha);
			if(usuList.size()==0){
				JSFUtil.adicionarMensagemError("Login ou Senha inválidos");	
			}else{
				JSFUtil.adicionarMensagemSucesso("Logado com sucesso");
				loggedIn = true;
			}
			context.addCallbackParam("loggedIn", loggedIn);	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
		
		
	}
	*/
	
	
	@EJB
	private UsuarioDM logado;

	public UsuarioDM getLogado() {
		if(logado == null){
			logado = new UsuarioDM();
		}
		return logado;
	}

	public void setLogado(UsuarioDM logado) {
		this.logado = logado;
	}
	
	public void autenticar() throws SQLException{
		RequestContext context = RequestContext.getCurrentInstance();
		boolean loggedIn = false;
		UsuarioDao uss = new UsuarioDao();
		List<UsuarioDM> usuList = uss.Select(logado.getLogin(), logado.getSenha());
		
		if(usuList.size()==0){
				JSFUtil.adicionarMensagemError("Login ou Senha inválidos");	
		}else{
			JSFUtil.adicionarMensagemSucesso("Logado com sucesso");
			loggedIn = true;
		}
		context.addCallbackParam("loggedIn", loggedIn);	
	}
	
	
	
}
