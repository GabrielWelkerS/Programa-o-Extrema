package estudoCollectionParte1;

import java.util.ArrayList;
import java.util.Collections;

public class SistemaEstoque {

	public static void main(String[] args) {

		ArrayList<Produto> g = new ArrayList<Produto>();
		g.add(new Produto(234, "Meia", 213));
		g.add(new Produto(145, "Casaco", 101));
		g.add(new Produto(123, "Blusa", 520));
		g.add(new Produto(456, "Boné", 59));
		g.add(new Produto(567, "Camisa", 10));
		
		System.out.println("Lista antes da ordenação:");
		
		for (Produto produto: g) {
			System.out.println(
				produto.quantidadeEstoque + " " + 
				produto.nomeProduto + " " + 
				produto.codigoProduto);
		}
		
		System.out.println();
		
		System.out.println("Lista depois da ordenação:");
		
		Collections.sort(g, new EstoqueComparator());
		
		for(Produto produto: g) {
			System.out.println(
					produto.quantidadeEstoque + " " + 
					produto.nomeProduto + " " + 
					produto.codigoProduto);
		}
		
	}

}
