package instrucao_repeticao;

import java.util.Scanner;

public class While_exercicio {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int op;

		do {
			
			System.out.println("-------------");
			System.out.println("Menu Princpal");
			System.out.println("-------------");
			System.out.println("Selecione uma das opções abaixo:");
			System.out.println("1 - Aluno");
			System.out.println("2 - Prpfessor");
			System.out.println("3 - Coordenador");
			System.out.println("0 - Sair");
			
			System.out.println("Qual opção deseja?");
			op =  teclado.nextInt();
			
			if (op == 0)
			break;
			
			
			switch(op) {
				
			case 1:
				System.out.println("Você selecionou a opção de aluno");
				break;
			case 2:
				System.out.println("Você selecionou a opção de Professor");
				break;
			case 3: 
				System.out.println("Você selecionou a opção de Cordernador");
				break;
			default:
				System.out.println("Você selecionou a opção Invalida");
				break;
			}
			
			System.out.println("Aperte 4 para voltar");
			int voltar = teclado.nextInt();
			
			if(voltar != 4) {
				break;
			}
			
		} while(true);
		
		System.out.println("Fim");
		
	}

}
