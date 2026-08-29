package excecoes;


public class Criandonovasexcecoes2 {

    public static void main(String[] args) {
    	
    	Excecao2 exemplo = new Excecao2();

    	try {

    	    exemplo.dividir(10, 0);

    	} catch (Exception e) {

    	    System.out.println("Erro!");
    	}
    }
}
