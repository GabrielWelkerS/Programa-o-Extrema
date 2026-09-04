package trabalhandocomarquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Lendoarquivos_Binarios {

	public static void main(String[] args) throws IOException {

		String matricula;
		String nome;
		double teste, prova, media;
		int faltas;
		
		FileInputStream arq = new FileInputStream("/home/gabriel/Documentos/trabalhando_arquivos/exemploBi1.txt");
		DataInputStream lerArq = new DataInputStream(arq);
		
		matricula = lerArq.readUTF();
		nome = lerArq.readUTF();
		teste = lerArq.readDouble();
		prova = lerArq.readDouble();
		faltas = lerArq.readInt();
		
		media = (teste+prova)/2;
		
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("Teste: " + teste);
		System.out.println("Prova: " + prova);
		System.out.println("Faltas: " + faltas);
		
		arq.close();
		
	}

}
