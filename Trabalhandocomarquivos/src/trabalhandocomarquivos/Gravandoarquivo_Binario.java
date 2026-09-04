package trabalhandocomarquivos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Gravandoarquivo_Binario {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        String matricula;
        String nome;
        double teste, prova;
        int faltas;

        FileOutputStream arq = new FileOutputStream(
            "/home/gabriel/Documentos/trabalhando_arquivos/exemploBi1.txt"
        );

        DataOutputStream gravarArq = new DataOutputStream(arq);

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

        gravarArq.writeUTF(matricula);
        gravarArq.writeUTF(nome);
        gravarArq.writeDouble(teste);
        gravarArq.writeDouble(prova);
        gravarArq.writeInt(faltas);

        gravarArq.close();
        teclado.close();

        System.out.println("Gravação efetuada com sucesso");
    }
}