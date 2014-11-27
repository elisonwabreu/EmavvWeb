package br.com.emavv.web.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class JSFUtil {

	public static void adicionarMensagemSucesso(String mensagem) {

		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				mensagem, "");
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.addMessage(null, msg);

	}
	public static void adicionarMensagemError(String mensagem) {

		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
				mensagem, "");
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.addMessage(null, msg);

	}
}
