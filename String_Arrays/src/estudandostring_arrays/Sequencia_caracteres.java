package estudandostring_arrays;

import java.util.Scanner;

public class Sequencia_caracteres {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
		String nome = "Gabriel";
		
		System.out.println("Professor " + nome);
		*/
		
		Scanner teclado = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = teclado.next();
		
		System.out.println("Professor " + nome);
		
	}

}
