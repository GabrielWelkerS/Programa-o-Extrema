package instrucao_java;

public class If_operadores {

	public static void main(String[] args) {

		/*int valor = 8;
		
		if(valor == 8) {
			System.out.println("Valor = 8");
			System.out.println("Gostou?");
		}
		else {
			System.out.println("Valor <> 8");
		}
		*/
		
		int valor = 7;
		
		if(valor == 8) {
			System.out.println("Valor = 8");
		}
		else
			if(valor > 8) {
				System.out.println("Valor > 8");
			}
			else {
				System.out.println("Valor < 8");
			}
	}

}
