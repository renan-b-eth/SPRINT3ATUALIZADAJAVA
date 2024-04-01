package br.com.fiap.beans;

public class Usuario {
	
	private int codigo;
	private String login, senha, nome, email, dt_nasc, tel, id_endereco, sexo;
	private char sexo2;
	public Usuario(int codigo, String login, String senha, String nome, String email, String dt_nasc, String tel,
			String id_endereco, String sexo, char sexo2) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.dt_nasc = dt_nasc;
		this.tel = tel;
		this.id_endereco = id_endereco;
		this.sexo = sexo;
		this.sexo2 = sexo2;
	}
	public char getSexo2() {
		return sexo2;
	}
	public void setSexo2(char sexo2) {
		this.sexo2 = sexo2;
	}
	public Usuario(int codigo, String login, String senha, String nome, String email, String dt_nasc, String tel,
			String id_endereco, String sexo) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.dt_nasc = dt_nasc;
		this.tel = tel;
		this.id_endereco = id_endereco;
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDt_nasc() {
		return dt_nasc;
	}
	public void setDt_nasc(String dt_nasc) {
		this.dt_nasc = dt_nasc;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(String id_endereco) {
		this.id_endereco = id_endereco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Usuario() {
		super();
	}
}
