package estudoCollectionParte1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tipo_TreeSet {

	public static void main(String[] args) {
		
		Set<Integer> hunter = new TreeSet<>();
		
		hunter.add(405);
		hunter.add(44);
		hunter.add(403);
		hunter.add(99);
		hunter.add(405);
		hunter.add(404);
		
		Iterator<Integer> correr = hunter.iterator();
		
		while(correr.hasNext()) {
			System.out.println(correr.next());
		}
		
	}

}
