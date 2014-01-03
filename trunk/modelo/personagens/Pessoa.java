package personagens;

public class Pessoa {
	private String nome;
	private String rg;
	private String cpf;
	private Inscrito inscrito;
	private Funcionario funcionario;
	private Hospede hospede;
	
	
	public Pessoa() {
	
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
