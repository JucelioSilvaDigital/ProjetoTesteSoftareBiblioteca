import java.util.ArrayList;

public class Livro {
	private String titulo;
	private String autor;
	private String nr_unico;
	private boolean disponibilidade;
	private ArrayList<Exemplar> listaExemplares = new ArrayList<>();
	

	public Livro(Biblioteca biblioteca, String titulo, String autor) {
		super();
		setTitulo(titulo);
		this.autor = autor;
		setNr_unico(biblioteca);
		this.disponibilidade = true;
		biblioteca.setAddLivro(this);
	}

	public String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
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

	private void setNr_unico(Biblioteca biblioteca) {
		int numero = biblioteca.qtdLivros() + 1;
		this.nr_unico = "lv"+Integer.toString(numero);
		System.out.println("Livro "+ getNr_unico() +" cadastrado com sucesso");
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public void setListaExemplares(Exemplar exemplar) {
		this.listaExemplares.add(exemplar);
	}

	public ArrayList<Exemplar> getListaExemplares() {
		return listaExemplares;
	}

	

}
