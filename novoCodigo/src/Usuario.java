import java.util.ArrayList;

public class Usuario {
	private String nome;
	private ArrayList<Exemplar> listaLivros = new ArrayList<>();

	// construtor
	public Usuario(String nome) {
		super();
		this.nome = nome;
	}

	// mostra o nome
	public String getNome() {
		return nome;
	}

	// define um nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// retorna uma lista de exemplares emprestados pelo usuario
	public ArrayList<Exemplar> getListaeExemplars() {
		return listaLivros;
	}

	// adiciona o livro que o usuario emprestou
	public boolean anexaLivroEmprestado(Exemplar exemplar) {
		listaLivros.add(exemplar);
		return true;
	}

	// remove o livro que o usuario devolveu
	public boolean desanexaLivroEmprestado(Exemplar livro) {
		if (listaLivros.contains(livro)) {
			this.listaLivros.remove(livro);
			return true;
		} else {
			return false;
		}
	}

	// retorna os livros que o usuario tomou emprestado algum exemplar
	public ArrayList<Livro> getListaLivros() {
		ArrayList<Livro> listaLivrosDoUsuario = new ArrayList<>();
		for (Exemplar livro : listaLivros) {
			listaLivrosDoUsuario.add(livro.getLivro());
		}
		return listaLivrosDoUsuario;
	}

}
