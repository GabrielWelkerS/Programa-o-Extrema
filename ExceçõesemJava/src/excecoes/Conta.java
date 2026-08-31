package excecoes;

public class Conta {

	 private float saldo = 15000;

	    public void depositar(float valor)
	            throws SaldoContaException {

	        float total = saldo + valor;

	        if (total > 20000) {

	            throw new SaldoContaException(total);
	        }

	        saldo = total;
	    }
}
