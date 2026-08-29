package poo;

public class Exemplo_objeto {

	public static void main(String[] args) {

		AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();
		Professor professor = new Professor();
		
		// Aluno do Ensino Médio.
		
		alunoEnsinoMedio.nome = "Kaue";
		alunoEnsinoMedio.teste = 9;
		alunoEnsinoMedio.prova = 10;
		
		System.out.println("Aluno do Ensino médio: ");
		System.out.println("Nome: " + alunoEnsinoMedio.getNome());
		System.out.println("Média: " + alunoEnsinoMedio.getMedia());
		
		// Aluno do Ensino Superior.
		
		alunoEnsinoSuperior.nome = ("Eduardo");
		alunoEnsinoSuperior.teste = 8;
		alunoEnsinoSuperior.prova = 9;
		
		System.out.println("Aluno do Ensino Superior: ");
		System.out.println("Nome: " + alunoEnsinoSuperior.getNome());
		System.out.println("Média: " + alunoEnsinoSuperior.getMedia());
		
		professor.setNome("Ms. Walker");
		professor.setSalario(4000);
		
		// Professor
		
		/*
		System.out.println(professor.getNome());
		System.out.println(professor.getSalario());
		System.out.println(professor.getInss());
		System.out.println(professor.getSalarioLiquido());
		*/
	}

}
