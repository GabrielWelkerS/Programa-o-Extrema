package banco_Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeletandoDados {

	public static void main(String[] args) {

		final String usuario = "postgres";
		final String senha = "123456";
		final String url = "jdbc:postgresql://localhost:5432/Escola";
		final String driverBanco = "org.postgresql.Driver";
		final String instrucao_delete = "DELETE FROM  Alunos WHERE id = ?";
		
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_delete);
			
			preparedStatement.setInt(1, 7);
			
			preparedStatement.executeUpdate();
			
			System.out.println("Exclusão realizada com sucesso");
			
		}catch(Exception exception) {
			exception.printStackTrace();
		}

	}
	
}