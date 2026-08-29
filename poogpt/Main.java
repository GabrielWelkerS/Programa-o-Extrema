package poogpt;

public class Main {

	public static void main(String[] args) {
		
		/*
		Cachorro cachorro = new Cachorro("Rex", 5);
		Gato gato = new Gato("Mia", 3);
		Passaro passaro = new Passaro("Piu", 2);
		*/
		
		Animal animal1 = new Cachorro("Bela", 5);
		Animal animal2 = new Gato("Toby", 3);
		Animal animal3 = new Passaro("Baby", 2);
		
		animal1.emitirSom();
		animal2.emitirSom();
		animal3.emitirSom();
		
		/*
		cachorro.dormir();
		gato.dormir();
		passaro.dormir();
		
		cachorro.emitirSom();
		gato.emitirSom();
		passaro.emitirSom();
		
		passaro.voar();
		*/
	}

}
