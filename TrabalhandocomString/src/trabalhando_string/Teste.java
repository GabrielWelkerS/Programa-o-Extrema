package trabalhando_string;

public class Teste {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//String nome = "Pikachu ";
		//String tipo = "Elétrico";
		
		String pokedex;
		
		StringBuilder pokemon = new StringBuilder();
		
		pokemon.append("Pokemon: Pikachu ");
		pokemon.append("Tipo: Elétrico");
		
		pokedex = pokemon.toString();
		
		System.out.println(pokemon);
		
		
	}

}
