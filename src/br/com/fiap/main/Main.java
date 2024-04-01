package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.LogsDAO;
import br.com.fiap.DAO.UsuarioDAO;
import br.com.fiap.beans.Data;
import br.com.fiap.beans.Logs;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

public class Main {
	
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
		
		//Scanner in = new Scanner(System.in);
		//ConexaoFactory cn = new ConexaoFactory();
		//System.out.println(cn.conexao());
		
		//System.out.println("Digite qual opção deseja realizar: \n1-CADASTRAR USUARIO \n2- LOGAR USUARIO, \n3- Cadastrar logs, \n4 - Consultar logs");
		String resultado = texto("Digite qual opção deseja realizar: \n1-CADASTRAR USUARIO \n2- LOGAR USUARIO, \n3- Cadastrar logs, \n4 - Consultar logs");
		
		String usuarioEmail = "opa", senhaUsuario = "opa";
			
			if(resultado.equals("1")) {
				System.out.println("Digitou 1");
				Usuario usuario = new Usuario();
				UsuarioDAO dao = new UsuarioDAO();
				System.out.println("PASSOU");
				usuario.setCodigo(inteiro("Código")); // aqui deveria ser automatico mas o usuario vai digitar pois ireimos atualizar pro site.
				usuario.setNome(texto("Nome"));
				usuario.setSexo(texto("Sexo M OU F OU I"));
				usuario.setTel(texto("Telefone")); // ser de tempo validação de telefone
				usuario.setEmail(texto("Email")); // se der tempo fazer validação de email com @dominio
				usuario.setSenha(texto("Senha")); // se der tempo validação de senha
				
				System.out.println(dao.inserir(usuario));
				
			} else if(resultado.equals("2")) {
				String emailDigitado = texto("Digite o Email");
				String senhaDigitada = texto("Digite a senha:");
				UsuarioDAO dao = new UsuarioDAO();
				List<Usuario> listaUsuarios = (ArrayList<Usuario>) dao.selecionar();
				
				if(listaUsuarios != null) {
					for(Usuario u : listaUsuarios) {
						if(senhaDigitada.equals(u.getSenha()) && emailDigitado.equals(u.getEmail())) {
							JOptionPane.showMessageDialog(null, "LOGADO COM SUCESSO.");
							//sem o break repete todos da lista
							break;
						} else {
							JOptionPane.showMessageDialog(null, "LOGIN INVALIDO");
							break;
						}
						
					}
				}
				
				
				
			} else if(resultado.equals("3")) {
				//cadastre 2 tipo de logs, uma com o tipo critico e outra como relatorio para fazer o where da query na opção 4
				Logs log = new Logs();
				LogsDAO daolog = new LogsDAO();
				
				log.setCodigo(inteiro("codigo"));
				log.setTitulo(texto("titulo"));
				log.setDescricao(texto("descricao"));
				log.setTipo(texto("Tipo"));
				//pega a data do sistema automatico
				// DATA PRECISA SER VARCHAR(50) NA QUERY, POIS A DATA ESTÁ DANDO ERRO NO MONTH PELO PADRÃO DO BRASIL.
				Data data = new Data();
				log.setData(data.data());
				System.out.println(daolog.inserir(log));
			} else if(resultado.equals("4")) {
				LogsDAO dao = new LogsDAO();
				String tipo = texto("QUAL TIPO DE LOG? 1 - urgencia / 2 -relatorio");
				List<Logs> listaLogs = (ArrayList<Logs>) dao.selecionar(tipo);
				
				if(listaLogs != null) {
					for(Logs l : listaLogs) {
						JOptionPane.showMessageDialog(null, "DESCRIÇÃO: "+ l.getDescricao() + "\nDATA: " + l.getData() );
					}
				}
			}

		
	}

}
