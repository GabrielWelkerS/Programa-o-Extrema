package estudoCollectionsParte2;

import java.util.TreeMap;

public class ExemploTreeMap {

	public static void main(String[] args) {

		TreeMap<String, String> mapaNomes = new TreeMap<>();
		mapaNomes.put("Recepcionista","Eduarda");
		mapaNomes.put("Professor","Fernando");
		mapaNomes.put("Técnico","Gabriel");
		mapaNomes.put("Gerente","Edson");
		
		System.out.println("TreeMap de Nomes: " + mapaNomes);
		
		System.out.println("Chaves: " + mapaNomes.keySet());
		System.out.println("Valores: " + mapaNomes.values());
		System.out.println("Chave/valor: " + mapaNomes.entrySet());
	}

}
