
public abstract class Conta implements iConta {

	private static int AGENCIA_PADRAO = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	private static int SEQUENCIAL = 0;

	public Conta(Cliente cliente) {
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;

	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		saldo += valor;

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);

	}

	public static int getAGENCIA_PADRAO() {
		return AGENCIA_PADRAO;
	}

	public static void setAGENCIA_PADRAO(int AGENCIA_PADRAO) {
		Conta.AGENCIA_PADRAO = AGENCIA_PADRAO;
	}

	protected void imprimirInfoComuns() {
		System.out.println(String.format("Títular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
