
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (valor > 1000) {
			System.out.println("Voc� excedeu o limite de transfer�ncia para a conta poupan�a");
		}
		else {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato Conta Popanca ***");
		super.imprimirInfoComuns();
		
	}

	
}
