package banco_Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exemplobanco_dados2 {

	public static void main(String[] args) {

		final String usuario = "postgres";
		final String senha = "123456";
		final String url = "jdbc:postgresql://localhost:5432/Escola";
		final String driverBanco = "org.postgresql.Driver";
		final String instrucaoSelect = "SELECT * FROM Alunos"; 
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			
			Statement sentenca = conexao.createStatement();
			
			ResultSet rs = sentenca.executeQuery(instrucaoSelect);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String curso = rs.getString("curso");
				System.out.println("Id: " + id + " - Nome: " + nome + " - Curso: " + curso);
			}
			
			System.out.println("Consulta realizada com suceeso");
			
		}catch(Exception exception) {
			exception.printStackTrace();
		}
	}

}
