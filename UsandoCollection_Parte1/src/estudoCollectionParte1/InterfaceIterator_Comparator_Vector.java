package estudoCollectionParte1;

import java.util.Vector;

public class InterfaceIterator_Comparator_Vector {

	public static void main(String[] args) {
		// Diferença: Ele é thread safe, protegido.
		Vector<String> listNome = new Vector<>();
		
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
