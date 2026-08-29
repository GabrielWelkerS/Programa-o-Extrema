package trabalhando_string;

public class ExemploClasseString2 {

	public static void main(String[] args) {

		String nome = "Gabriel";
		String sobrenome = "Guedes";
		String nomeCompleto = nome + sobrenome;
		String nomeComBuffer;
		
		System.out.println(nome + " " + sobrenome);
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(nome);
		buffer.append(sobrenome);
		
		nomeComBuffer = buffer.toString();
		
		System.out.println(nomeCompleto);
		System.out.println(nomeComBuffer);
		
	}

}
