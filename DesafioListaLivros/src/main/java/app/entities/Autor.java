package app.entities;

public class Autor {
	
	private String nome;
	
	public Autor(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + "]";
	}
}
