
public class Main {

	public static void main(String[] args) {
		Cliente daniel = new Cliente();
		daniel.setNome("rafhael");

		Conta cc = new ContaCorrente(daniel);
		Conta poupanca = new ContaPoupanca(daniel);

		cc.depositar(2000);
		cc.transferir(300, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
