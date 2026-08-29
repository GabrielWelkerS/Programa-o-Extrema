package excecoesDirecionadas;

public class Principal3 {

	public static void main(String[] args) {

		try {
			throw new ExcecaoCustomizada2("Minha exceção");
		}
		catch (ExcecaoCustomizada2 e) {
			System.out.println(e);
		}
	}

}
