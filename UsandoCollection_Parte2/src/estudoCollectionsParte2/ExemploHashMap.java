package estudoCollectionsParte2;

import java.util.HashMap;

public class ExemploHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> linguagensProgramacao = new  HashMap<>();
		
		linguagensProgramacao.put(1, "Java");
		linguagensProgramacao.put(2, "JavaScript");
		linguagensProgramacao.put(3, "Phyton");
		
		System.out.println("Conteúdo do HashMap: " + linguagensProgramacao);
		
		String valor = linguagensProgramacao.get(2);
		System.out.println("Elemento da chave 2: " + valor);
	}

}
