package entidade;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double valorTotalNoEstoque() {
		return preco * quantidade;
	}
	
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome 
				+ ", R$ " 
				+ String.format("%.2f", preco) 
				+ ", "
				+ quantidade 
				+ " unidades, Total: R$ " 
				+ String.format("%.2f", valorTotalNoEstoque());
	}
}
