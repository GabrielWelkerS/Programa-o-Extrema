package poogpt;

public class Passaro extends Animal implements Voador{
	
	public Passaro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(nome + " diz: Piu piu!");
		}
	
	@Override
	public void voar() {
		System.out.println(nome + " está voando.");
	}
	
}
