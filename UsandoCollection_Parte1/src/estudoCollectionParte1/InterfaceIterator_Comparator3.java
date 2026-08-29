package estudoCollectionParte1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class InterfaceIterator_Comparator3 {

	public static void main(String[] args) {

		ArrayList<String> listNome = new ArrayList<>();
		
		listNome.add("Gabriel");
		listNome.add("Kevin");
		listNome.add("Erick");
		listNome.add("Miguel");
		listNome.add("Ana");
		
		System.out.println("Elementos antes de ordenação:");
		for(int i = 0; i < listNome.size(); i++) {
			System.out.println(listNome.get(i));
		}
		
		Comparator<String> comparator = Collections.reverseOrder();
		
		Collections.sort(listNome, comparator);
		
		System.out.println("Elementos depois da ordenação");
		
		for(String nome: listNome) {
			System.out.println(nome);
			
		}
	}

}
