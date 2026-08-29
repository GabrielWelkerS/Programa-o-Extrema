package excecoes;

public class Criandonovasexcecoes3 {

    public static void main(String[] args) {

        try {

            verificarIdade(20);

        } catch (IdadeInvalidaException e) {

            System.out.println(e.getMessage());

        }
    }

    public static void verificarIdade(int idade)
            throws IdadeInvalidaException {

        if (idade < 18) {
            throw new IdadeInvalidaException("Idade menor que 18.");
        }

        System.out.println("Idade válida!");
    }
}