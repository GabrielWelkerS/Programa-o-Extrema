package estudoCollectionsParte2;

import java.util.Hashtable;

public class ExemploHashtable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> linguagensProgramacao = new  Hashtable<>();
		
		linguagensProgramacao.put(1, "Java");
		linguagensProgramacao.put(2, "JavaScript");
		linguagensProgramacao.put(3, "Phyton");
		
		System.out.println("Conteúdo do HashTable: " + linguagensProgramacao);
		
		String valor = linguagensProgramacao.get(2);
		System.out.println("Elementos da chave 2: " + valor);
	}

}
