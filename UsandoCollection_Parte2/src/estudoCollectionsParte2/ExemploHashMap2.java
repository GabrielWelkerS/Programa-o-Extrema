package estudoCollectionsParte2;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap2 {

	public static void main(String[] args) {
		
		Map<Integer, String> linguagensProgramacao = new  HashMap<>();
		
		linguagensProgramacao.put(1, "Java");
		linguagensProgramacao.put(2, "JavaScript");
		linguagensProgramacao.put(3, "Phyton");
		
		System.out.println("Conteúdo do HashMap: " + linguagensProgramacao);
		
		System.out.println("Chaves: " + linguagensProgramacao.keySet());
		System.out.println("Valores: " + linguagensProgramacao.values());
		System.out.println("Chave/valor: " + linguagensProgramacao.entrySet());
	}

}
