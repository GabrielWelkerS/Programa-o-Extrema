package banco_Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InserindoDados {

	public static void main(String[] args) {

		final String usuario = "postgres";
		final String senha = "123456";
		final String url = "jdbc:postgresql://localhost:5432/Escola";
		final String driverBanco = "org.postgresql.Driver";
		final String instrucao_insert = "INSERT INTO Alunos(nome, curso) VALUES(?,?)";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_insert);
			
			
			preparedStatement.setString(1,"teste");
			preparedStatement.setString(2, "exemplo");
			
			preparedStatement.executeUpdate();
			
			System.out.println("inclusão realizada com sucesso");
			
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		
	}

}
