package br.com.std.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static Connection connection = null;
	
	public static Connection getConnection() throws SQLException{
		if (connection == null){
			try {
				/* Configure o usuario e senha do banco de acordo suas configuracoes */
				String usuario = "java"; // Usuario root ou outro com permissao no banco mydb
				String senha = "java"; // Senha do usuario
				
				return DriverManager.getConnection("jdbc:mysql://127.0.0.1/mydb", usuario, senha);
			} catch (SQLException e) {
				throw new RuntimeException(e + "Driver nao localizado!");
			}
		}
		return connection;
	}
	
	public void finalize(){
		try {
			connection.close();
			System.out.println("Conexao finalizada!");
		} catch (SQLException e) {
			System.out.println("Erro ao finalizar a conexao com o banco!");
		}
	}

}
