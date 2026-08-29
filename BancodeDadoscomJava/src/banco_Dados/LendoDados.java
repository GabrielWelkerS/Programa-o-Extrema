package banco_Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LendoDados {

	public static void main(String[] args) {

		final String usuario = "postgres";
		final String senha = "123456";
		final String url = "jdbc:postgresql://localhost:5432/Escola";
		final String driverBanco = "org.postgresql.Driver";
		final String instrucao_select = "SELECT * FROM Alunos";
		
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucao_select);
			
			ResultSet resultado = preparedStatement.executeQuery();
			
			while(resultado.next()) {
				int id = resultado.getInt("id");
				String nome = resultado.getString("nome");
				String curso = resultado.getString("curso");
				System.out.println("id: " + id + " - Nome: " + nome + " - Curso: " + curso);
			}
			
		}catch(Exception exception) {
			exception.printStackTrace();
		}
	}
}