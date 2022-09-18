import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Livro> catalogoLivros = new ArrayList<>();
	private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
	private ArrayList<Bibliotecaria> listaBibliotecaria = new ArrayList<>();

	public Biblioteca(String nome) {
		super();
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Biblioteca foi criada com sucesso!");
	}

	public void cadastrarUsuario(Usuario usuario) {
		if (listaUsuarios.contains(usuario)) {
			System.out.println("O Usuário já existe no sistema.");
		} else {
			listaUsuarios.add(usuario);
		}

	}

	public void cadastrarLivro(Livro livro) {
		if (catalogoLivros.contains(livro)) {
			System.out.println("Esse livro já existe no sistema.");
		} else {
			catalogoLivros.add(livro);
		}
	}

	public void setAddBibliotecaria(Bibliotecaria bibliotecaria) {
		this.listaBibliotecaria.add(bibliotecaria);
		System.out.println("Bibliotecario(a) " + bibliotecaria.getBibliotecaria().getNome()
				+ " foi adicionado(a) na biblioteca: " + getNome());
	}

	public int qtdLivros() {
		return catalogoLivros.size();
	}

	public void setAddLivro(Livro livro) {
		catalogoLivros.add(livro);
	}

	public ArrayList<Livro> getListLivroNaBiblioteca() {
		return catalogoLivros;
	}

	public ArrayList<Usuario> getListUsuariaoDaBiblioteca() {
		return listaUsuarios;
	}

	public void setAddUsuarioNaBiblioteca(Usuario usuario) {
		this.listaUsuarios.add(usuario);
	}

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
