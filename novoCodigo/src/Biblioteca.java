import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Livro> catalogoLivros = new ArrayList<>();
	private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
	private ArrayList<Bibliotecaria> listaBibliotecaria = new ArrayList<>();

	// construtor
	public Biblioteca(String nome) {
		super();
		setNome(nome);
	}

	// retorna o nome
	public String getNome() {
		return nome;
	}

	// adiciona/define um nome
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Biblioteca foi criada com sucesso!");
	}

	// cadastra usuario na biblioteca
	public boolean cadastrarUsuario(Usuario usuario) {
		if (listaUsuarios.contains(usuario)) {
			System.out.println("O Usuário já existe no sistema.");
			return false;
		} else {
			listaUsuarios.add(usuario);
			return true;
		}

	}

	// cadastra livro na biblioteca
	public boolean cadastrarLivro(Livro livro) {
		if (catalogoLivros.contains(livro)) {
			System.out.println("Esse livro já existe no sistema.");
			return false;
		}
			catalogoLivros.add(livro);
			return true;
		
	}

	// adiciona um funcionario a biblioteca (bibliotecaria)
	public boolean setAddBibliotecaria(Bibliotecaria bibliotecaria) {
		if(listaBibliotecaria.contains(bibliotecaria)){
			System.out.println("Esse livro já existe no sistema.");
			return false;
		}
			this.listaBibliotecaria.add(bibliotecaria);
			System.out.println("Bibliotecario(a) " + bibliotecaria.getBibliotecaria().getNome()
					+ " foi adicionado(a) na biblioteca: " + getNome());
					return true;
		
	}

	// retorna a quantidade de livros
	public int qtdLivros() {
		return catalogoLivros.size();
	}

	// adiciona livro a lista de livros
	public void setAddLivro(Livro livro) {
		catalogoLivros.add(livro);
	}

	// retorna a lista de livros
	public ArrayList<Livro> getListLivroNaBiblioteca() {
		return catalogoLivros;
	}

	// retorna a lista de usuarios
	public ArrayList<Usuario> getListUsuariaoDaBiblioteca() {
		return listaUsuarios;
	}

	// adiciona usuario na lista de usuarios
	public void setAddUsuarioNaBiblioteca(Usuario usuario) {
		this.listaUsuarios.add(usuario);
	}

	// atuializa o status para false cado a quantidade de livros emprestados seja
	// zero
	public void atualizaStatus() {
		for (Livro livro : catalogoLivros) {
			int aux = 0;
			for (Exemplar exemplar : livro.getListaExemplares()) {
				if (!exemplar.isEmprestado()) {
					aux++;
				}
			}

			if (aux == 0) {
				livro.setDisponibilidade(false);
			}
		}
	}

}
