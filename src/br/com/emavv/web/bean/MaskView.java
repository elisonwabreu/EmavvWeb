package br.com.emavv.web.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MaskView {
     
    private String date;
    private String telefone;
    private String phoneExt;
    private String cpf;
    private String cep;
    private String ssn;
    private String productKey;
 
    
    
    public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getDate() {
        return date;
    }
 
    public void setDate(String date) {
        this.date = date;
    }
 
    public String getTelefone() {
        return telefone;
    }
 
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
    public String getPhoneExt() {
        return phoneExt;
    }
 
    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }
 
    public String getcpf() {
        return cpf;
    }
 
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
 
    public String getSsn() {
        return ssn;
    }
 
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
 
    public String getProductKey() {
        return productKey;
    }
 
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }
}