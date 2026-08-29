package estudoCollectionParte1;

import java.util.HashMap;
import java.util.Map;

public class Tipo_Map {

	public static void main(String[] args) {

		Map<Integer, String> pokemons = new HashMap<>();
		
		pokemons.put(1, "Bulbasaur");
		pokemons.put(2, "Ivysaur");
		pokemons.put(99, "Venusaur");
		
		System.out.println(pokemons.get(99));
		System.out.println(pokemons.size());
		
	}

}
