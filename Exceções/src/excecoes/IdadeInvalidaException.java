package excecoes;

@SuppressWarnings("serial")
public class IdadeInvalidaException extends Exception {

    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}