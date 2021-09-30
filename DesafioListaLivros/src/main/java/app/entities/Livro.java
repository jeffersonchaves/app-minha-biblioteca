package app.entities;

public class Livro {
	
	private String titulo;
	private Autor autor;
	private String genero;
	private Integer ano;
	private Integer paginas;
	
	public Livro(String titulo, Integer ano, String genero, Integer paginas, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.ano = ano;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	
	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + "]";
	}
	
	
	
}
