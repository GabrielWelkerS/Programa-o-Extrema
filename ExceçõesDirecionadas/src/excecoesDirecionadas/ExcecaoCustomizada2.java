package excecoesDirecionadas;


@SuppressWarnings("serial")
public class ExcecaoCustomizada2 extends Exception {
	
	String mensagem;
	
	public ExcecaoCustomizada2(String str) {
		mensagem = str;
	}
	
	public String toString() {
		return("Exceção customizada: " + mensagem);
	}
}
