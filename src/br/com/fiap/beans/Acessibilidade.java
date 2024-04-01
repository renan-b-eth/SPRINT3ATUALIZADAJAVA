package br.com.fiap.beans;

public class Acessibilidade {
	private int codigo, tiposAcessibilidade;
	private String tipoAcessibilidade;
	public Acessibilidade(int codigo, int tiposAcessibilidade, String tipoAcessibilidade) {
		super();
		this.codigo = codigo;
		this.tiposAcessibilidade = tiposAcessibilidade;
		this.tipoAcessibilidade = tipoAcessibilidade;
	}
	public Acessibilidade() {
		super();
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getTiposAcessibilidade() {
		return tiposAcessibilidade;
	}
	public void setTiposAcessibilidade(int tiposAcessibilidade) {
		this.tiposAcessibilidade = tiposAcessibilidade;
	}
	public String getTipoAcessibilidade() {
		return tipoAcessibilidade;
	}
	public void setTipoAcessibilidade(String tipoAcessibilidade) {
		this.tipoAcessibilidade = tipoAcessibilidade;
	}
	
}
