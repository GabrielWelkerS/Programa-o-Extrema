package trabalhandocomarquivos;

import java.io.File;
import java.util.Scanner;

public class ClasseFile {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite o nome de um arquivo com seu path:\n");
		String nome = teclado.next();
		
		File objFile = new File(nome);
		if (objFile.exists()) {
			if (objFile.isFile()) {
				System.out.println("Nome do Arquivo: " + objFile.getName());
				System.out.println("Tamanho do Arquivo: " + objFile.length());
			}
		}
		else System.out.println("Arquivos inexistente");
	}

}
