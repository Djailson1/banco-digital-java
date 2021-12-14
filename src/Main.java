public class Main {
	
	public static void main(String[] args) {
		
		Cliente djailson = new Cliente();
		djailson.setNome("Djailson");
		
		
		Conta cc = new ContaCorrente(djailson);
		Conta poupanca = new ContaPoupanca(djailson);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}