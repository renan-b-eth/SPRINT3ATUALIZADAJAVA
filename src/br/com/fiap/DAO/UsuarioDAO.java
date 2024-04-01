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

public class UsuarioDAO {
	public Connection minhaConexao;

	public UsuarioDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	//Insert
	public String inserir (Usuario usuario) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Insert into T_CADASTRO_USUARIO values (?, ?, ?, ?, ?, ?)");
		stmt.setInt(1, usuario.getCodigo());
		stmt.setString(2, usuario.getNome());
		stmt.setString(3, usuario.getSexo());
		stmt.setString(4, usuario.getTel());
		stmt.setString(5, usuario.getEmail());
		stmt.setString(6, usuario.getSenha());
		stmt.execute();
		stmt.close();
				
		return "Cadastrado com Sucesso!";

	}
	
	public List<Usuario> selecionar() throws SQLException{
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		PreparedStatement stmt = minhaConexao.prepareStatement("Select * from T_CADASTRO_USUARIO");
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			Usuario usuario = new Usuario();
			usuario.setCodigo(rs.getInt(1));
			usuario.setEmail(rs.getString(5));
			usuario.setSenha(rs.getString(6));
			listaUsuario.add(usuario);
		}
		
		return listaUsuario;
		
	}

	
	//Delete
	/*public String Deletar(Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from T_FIAP_PRODUTO where = ?");
		stmt.setInt(1, produto.getCodigo());
		stmt.execute();
		stmt.close();
		
		return "Deletado com Sucesso";
	}*/
	
	//Update
	/*public String atualizar(Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Update T_SALESFORCE_SPRINT3 set TIPO = ?, MARCA = ?, VALOR = ? where CODIGO = ?");
		
		stmt.setString(1, produto.getTipo());
		stmt.setString(2, produto.getMarca());
		stmt.setDouble(3, produto.getValor());
		stmt.setInt(4, produto.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		
		return "Atualizado com Sucesso";
	}*/
	
	//Select
	
}