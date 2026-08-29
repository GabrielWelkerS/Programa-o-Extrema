package instrucao_java;

public class Instrucao_switch {

	public static void main(String[] args) {

		int numero = 2;
		
		switch(numero) {
		case 1:
			//System.out.println("Você digitou 1");
			//break;
		case 2:
			System.out.println("Você digitou 1 ou 2");
			break;
		case 3:
			System.out.println("Você digitou 3");
		default:
			System.out.println("Você digitou uma valor invalido");
		}
	}
}
