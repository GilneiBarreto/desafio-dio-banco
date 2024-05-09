import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.setNome("Caixa");
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Cliente cliente2  = new Cliente();
		cliente2.setNome("Cliente");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		Conta c2 = new ContaCorrente(cliente2);
			
		banco.setContas(Arrays.asList(cc, poupanca, c2));
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.sacar(500);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		System.out.println("=== CLIENTES ===");
		banco.getClientes().forEach(cliente -> System.out.println(cliente.getNome()));
	}

}
