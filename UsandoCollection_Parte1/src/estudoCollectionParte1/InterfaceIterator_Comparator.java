package estudoCollectionParte1;

import java.util.ArrayList;

public class InterfaceIterator_Comparator {

	public static void main(String[] args) {

		ArrayList<String> listNome = new ArrayList<>();
		
		listNome.add("Gabriel");
		listNome.add("Kevin");
		listNome.add("Erick");
		listNome.add("Miguel");
		listNome.add("Ana");
		
		for(String nome: listNome) {
			System.out.println(nome);
		}
		
		System.out.println();
		System.out.println("Alteração");
		System.out.println();


		listNome.set(4, "Beatriz");
		listNome.remove(0);
		
		for(String nome: listNome) {
			System.out.println(nome);
		}
		
		System.out.println();
		System.out.println("Única menina da turma: " + listNome.get(3));
	}

}
