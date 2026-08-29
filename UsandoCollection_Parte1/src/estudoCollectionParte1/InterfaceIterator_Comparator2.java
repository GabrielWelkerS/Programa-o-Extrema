package estudoCollectionParte1;

import java.util.ArrayList;
import java.util.Iterator;

public class InterfaceIterator_Comparator2 {

	public static void main(String[] args) {

		ArrayList<String> listNome = new ArrayList<>();
		
		listNome.add("Gabriel");
		listNome.add("Kevin");
		listNome.add("Erick");
		listNome.add("Miguel");
		listNome.add("Ana");
		
		Iterator<String> iterator = listNome.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
