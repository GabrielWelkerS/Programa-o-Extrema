package banco_Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AtualizandoDados {

	public static void main(String[] args) {

		final String usuario = "postgres";
		final String senha = "123456";
		final String url = "jdbc:postgresql://localhost:5432/Escola";
		final String driverBanco = "org.postgresql.Driver";
		final String instrucao_update = "UPDATE Alunos SET nome=? WHERE ID=?";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_update);
			
			preparedStatement.setString(1, "Carlos");
			preparedStatement.setInt(2, 7);
			
			preparedStatement.executeUpdate();
			
			preparedStatement.executeUpdate();
			
			System.out.println("Alteração realizada com sucesso");
			
		}catch(Exception exception) {
			exception.printStackTrace();
		}
	}

}
