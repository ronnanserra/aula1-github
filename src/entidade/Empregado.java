package entidade;

public class Empregado {
	private int id;
	private String nome;
	private Double salario;

	public Empregado(int id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public void aumentarSalario(double percentual) {
		salario += salario / 100 * percentual ;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	

}
