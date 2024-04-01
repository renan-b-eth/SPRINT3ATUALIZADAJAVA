package br.com.fiap.beans;

public class Logs {
	
	private int codigo;
	private String titulo, tipo, descricao, data;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Logs() {
		super();
	}
	public Logs(int codigo, String titulo, String tipo, String descricao, String data) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.tipo = tipo;
		this.descricao = descricao;
		this.data = data;
	}
	
	

}
