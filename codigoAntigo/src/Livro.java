

public class Livro {
	private String titulo;
	private String autor;
	private String nr_unico;
	private boolean disponibilidade;
	private Usuario usuarioEmprestado;
	public Livro(String titulo, String autor, String nr_unico) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nr_unico = nr_unico;
		this.disponibilidade = true;
		this.usuarioEmprestado = null;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getNr_unico() {
		return nr_unico;
	}
	public void setNr_unico(String nr_unico) {
		this.nr_unico = nr_unico;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public Usuario getUsuarioEmprestado() {
		return usuarioEmprestado;
	}
	public void setUsuarioEmprestado(Usuario usuario) {
		this.usuarioEmprestado = usuario;
	}
	
	
	
	
}
