package excecoes;

public class Programa {

	public static void main(String[] args) {

		Conta conta = new Conta();
		
		try {
			
			conta.depositar(10000);
			
		} catch (SaldoContaException e) {
			
			System.out.println("Saldo ultrapassaria R$ 20.000");
			
			System.out.println("Saldo calculado: " + e.getSaldo());
		}	
	}
}
