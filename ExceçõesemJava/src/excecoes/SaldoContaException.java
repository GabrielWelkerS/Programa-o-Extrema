package excecoes;

@SuppressWarnings("serial")
public class SaldoContaException extends Exception{

	    private float saldo;

	    public SaldoContaException(float saldo) {
	        this.saldo = saldo;
	    }

		public float getSaldo() {
			return saldo;
		}
}
