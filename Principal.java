import discentes.EstudanteSuperior;

public class Principal {

	public static void main(String[] args) {

		EstudanteSuperior estudantesuperior = new EstudanteSuperior();
		
		//estudantesuperior.nome = "Gabriel";
		estudantesuperior.setNome("Gabriel");
		//estudantesuperior.prova = 10;
		estudantesuperior.setProva(10);
		//estudantesuperior.teste = 9;
		estudantesuperior.setTeste(9);
		
		System.out.println(estudantesuperior.getMedia());
	}

}
