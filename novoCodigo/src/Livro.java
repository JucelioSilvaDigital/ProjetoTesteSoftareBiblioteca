import java.util.ArrayList;

public class Livro {
	private String titulo;
	private String autor;
	private String nr_unico;
	private boolean disponibilidade;
	private ArrayList<Exemplar> listaExemplares = new ArrayList<>();

	// construtor
	public Livro(Biblioteca biblioteca, String titulo, String autor) {
		super();
		setTitulo(titulo);
		this.autor = autor;
		setNr_unico(biblioteca);
		this.disponibilidade = true;
		biblioteca.setAddLivro(this);
	}

	// retorna o titulo
	public String getTitulo() {
		return titulo;
	}

	// define um titulo
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// retorna o autor
	public String getAutor() {
		return autor;
	}

	// define um autor
	public void setAutor(String autor) {
		this.autor = autor;
	}

	// retorna o numero unico
	public String getNr_unico() {
		return nr_unico;
	}

	// gera o numero unico
	private void setNr_unico(Biblioteca biblioteca) {
		int numero = biblioteca.qtdLivros() + 1;
		this.nr_unico = "lv" + Integer.toString(numero);
		System.out.println("Livro " + getNr_unico() + " cadastrado com sucesso");
	}

	// retorna disponibilidade
	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	// define disponibilidade
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	// adiciona na lista de exemplares
	public void setListaExemplares(Exemplar exemplar) {
		this.listaExemplares.add(exemplar);
	}

	// retorna a lista de exemplares
	public ArrayList<Exemplar> getListaExemplares() {
		return listaExemplares;
	}

}
