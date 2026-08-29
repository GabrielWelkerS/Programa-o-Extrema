package estudoCollectionParte1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Tipo_LinkedList {

	public static void main(String[] args) {
		
		List<String> deck = new LinkedList<>();
		
		deck.add("Slifer, o Dragão Celeste");
		deck.add("Alfa, o Guerreiro Ímã");
		deck.add("Berfomet");
		deck.add("Beta, o Guerreiro Ímã");
		deck.add("Blader Notável");
		deck.add("Mago Negro");
		deck.add("Pequena Maga Negra");
		deck.add("Tartaruga Eletromagnética");
		deck.add("Arquidemônio de Gilfer");
		deck.add("Gama, o Guerreiro Ímã");
		deck.add("Gazelle, o Rei das Bestas Místicas");
		deck.add("Grande Escudo Gardna");
		deck.add("Rei Caveira");
		deck.add("Guardião Celta");
		deck.add("Kuriboh");
		deck.add("O Cavaleiro do Valete");
		deck.add("O Cavaleiro do Rei");
		deck.add("O Cavaleiro da Rainha");
		deck.add("Valkyrion, o Guerreiro Ímã");
		deck.add("Diabrete Selvagem");
		
		deck.set(3, "Beta, o Guerreiro Ímã");
		
		
		//System.out.println(deck);
		
		/*
		for(String cards: deck) {
			System.out.println(cards);
		}
		*/
		
		Iterator<String> percorrer =  deck.iterator();
		
		while(percorrer.hasNext()) {
			System.out.println(percorrer.next());
		}
	
	}

}
