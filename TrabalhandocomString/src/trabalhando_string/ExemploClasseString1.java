package trabalhando_string;

public class ExemploClasseString1 {

	public static void main(String[] args) {

		
		String nome = "Gabriel";
		String nomeGuerra = "Gabriel";
		String sobreNome = new String("Gabriel");
		
		/*
		if(nome==nomeGuerra) {
			System.out.println("Nomes iguais");
		}
		else {
			System.out.println("Nomes diferentes");
		}
		if(nome==sobrenome) {
			System.out.println("Nomes iguais");
		}
		else {
			System.out.println("Nomes diferentes");
		}
		*/
		
		if(nome.equals(nomeGuerra)) {
			System.out.println("Nomes iguais");
		}
		else {
			System.out.println("Nomes diferentes");
		}
		if(nome.equals(sobreNome)) {
			System.out.println("Nomes iguais");
		}
		else {
			System.out.println("Nomes diferentes");
		}
		
	}

}
