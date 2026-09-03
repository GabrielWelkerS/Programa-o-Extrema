package trabalhandocomarquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gravandoarquivo_Texto {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        String matricula;
        String nome;
        double teste, prova;
        int faltas;

        FileWriter arq = new FileWriter(
            "/home/gabriel/Documentos/trabalhando_arquivos/exemplo2.txt"
        );

        PrintWriter gravarArq = new PrintWriter(arq);

        System.out.println("Digite sua matricula: ");
        matricula = teclado.next();

        teclado.nextLine();

        System.out.println("Digite o seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite seu teste: ");
        teste = teclado.nextDouble();

        System.out.println("Digite sua prova: ");
        prova = teclado.nextDouble();

        System.out.println("Digite suas faltas: ");
        faltas = teclado.nextInt();

        gravarArq.println(matricula);
        gravarArq.println(nome);
        gravarArq.println(teste);
        gravarArq.println(prova);
        gravarArq.println(faltas);

        arq.close();
        teclado.close();

        System.out.println("Gravação efetuada com sucesso");
    }
}