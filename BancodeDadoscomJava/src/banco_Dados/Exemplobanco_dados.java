package banco_Dados;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exemplobanco_dados {

	public static void main(String[] args) {

		final String usuario = "postgres";
		final String senha = "123456";
		final String url = "jdbc:postgresql://localhost:5432/Escola";
		final String driverBanco = "org.postgresql.Driver";
		
		try {
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			
			System.out.println("Conexão realizada com sucesso");
			
		}catch(Exception exception) {
			System.out.println("Erro na conexão com o Banco de Dados");
		}
	}

}
