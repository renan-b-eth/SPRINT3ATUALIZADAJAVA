package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.beans.Logs;
import br.com.fiap.beans.Usuario;
import br.com.fiap.conexoes.ConexaoFactory;

public class LogsDAO {
	public Connection minhaConexao;

	public LogsDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	//Insert
	public String inserir (Logs logs) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Insert into T_LOGS values (?, ?, ?, ?, ?)");
		stmt.setInt(1, logs.getCodigo());
		stmt.setString(2, logs.getTitulo());
		stmt.setString(3, logs.getTipo());
		stmt.setString(4, logs.getDescricao());
		stmt.setString(5, logs.getData());
		stmt.execute();
		stmt.close();
				
		return "LOG CADASTRADA COM SUCESSO!";

	}
	
	public List<Logs> selecionar(String tipoLog) throws SQLException{
		List<Logs> listaLogs = new ArrayList<Logs>();
		// stmt que pega o tipo de log de urgencia
		PreparedStatement stmt = minhaConexao.prepareStatement("Select * from T_LOGS WHERE TIPO_lOGS = '" + tipoLog + "'"); //
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			Logs log = new Logs();
			log.setCodigo(rs.getInt(1));
			log.setDescricao(rs.getString(4));
			log.setData(rs.getString(5));
			listaLogs.add(log);
		}
		
		return listaLogs;
		
	}
		
	}
