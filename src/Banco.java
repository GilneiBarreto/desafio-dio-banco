import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public Set<Cliente> getClientes(){
		return this.getContas().stream().map(c -> c.getCliente()).collect(Collectors.toSet());
	}

}
