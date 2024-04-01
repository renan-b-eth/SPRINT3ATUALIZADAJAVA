package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.LogsDAO;
import br.com.fiap.DAO.UsuarioDAO;
import br.com.fiap.beans.Logs;
import br.com.fiap.beans.Usuario;

public class TesteCadastrar {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Instanciar objetos
		Usuario usuario = new Usuario();
		Logs log = new Logs();
		
		UsuarioDAO dao = new UsuarioDAO();
		LogsDAO daolog = new LogsDAO();
		
		//usuario
		usuario.setCodigo(inteiro("Código"));
		usuario.setNome(texto("Nome"));
		usuario.setSexo(texto("Sexo"));
		usuario.setTel(texto("Telefone"));
		usuario.setEmail(texto("Email"));
		usuario.setSenha(texto("Senha"));
		
		//log
		/*
		log.setCodigo(inteiro("codigo"));
		log.setTitulo(texto("titulo"));
		log.setDescricao(texto("descricao"));
		log.setTipo(texto("Tipo"));
		log.setData(texto("Data"));*/
		
		System.out.println(dao.inserir(usuario));
		/*System.out.println(daolog.inserir(log));*/
		
		
	}

}
