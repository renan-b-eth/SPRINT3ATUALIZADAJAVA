package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class ConexaoFactory {
	
	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
		TimeZone.setDefault(timeZone);
	}
	
	// CONEXÃO RM553228 SENHA 130201
	String rm = "RM553228", senha = "130201", server = "oracle.jdbc.driver.OracleDriver";
	
	// metodo de conexao com o banco de dados
	public Connection conexao() throws ClassNotFoundException, SQLException {
		// Driver 
		Class.forName(server);
		
		// Conexao
		return DriverManager.getConnection
		("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
				rm , senha) ;
	}
	

}
