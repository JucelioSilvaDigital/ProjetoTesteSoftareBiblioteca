import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Livro> catalogoLivros = new ArrayList<>();
	private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
	public Biblioteca(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void cadastrarUsuario(Usuario usuario) {
		if(listaUsuarios.contains(usuario)) {
			System.out.println("O Usuário já existe no sistema.");
		}else {
			listaUsuarios.add(usuario);
		}
		
	}
	
	public void cadastrarLivro(Livro livro) {
		if(catalogoLivros.contains(livro)) {
			System.out.println("Esse livro já existe no sistema.");
		}else {
			catalogoLivros.add(livro);
		}
	}
	
	public void emprestar(Usuario usuario, Livro livro) {
		if(catalogoLivros.contains(livro)) {
			if(livro.isDisponibilidade()) {
				usuario.anexaLivroEmprestado(livro);
				livro.setDisponibilidade(false);
				livro.setUsuarioEmprestado(usuario);
				System.out.println(livro.getTitulo()+" Emprestado com sucesso!");
			}else {
				System.out.println("Livro não disponível para empréstimo");
			}
		}else {
			System.out.println("Esse Livro não existe");
		}
		
	}
	
	public void devolver(Usuario usuario, Livro livro) {
		if(catalogoLivros.contains(livro)) {
			if(!livro.isDisponibilidade()) {
				usuario.desanexaLivroEmprestado(livro);
				livro.setDisponibilidade(true);
				livro.setUsuarioEmprestado(null);
				System.out.println("Devolução realizada com sucesso!");
			}else {
				System.out.println("Esse livro não pode ser devolvido, porque ele está disponível para empréstimo");
			}
		}else {
			System.out.println("Esse livro não existe para devolução");
		}
	}
	
	public void exibeLivrosDisponiveis() {
		System.out.println("Livros Disponíveis para Empréstimo");
		for (Livro livro : catalogoLivros) {
			if(livro.isDisponibilidade()) {
				System.out.println(livro.getTitulo());
			}
		}
	}
	
	public void exibeLivrosIndisponiveis() {
		System.out.println("Livros Indisponíveis para Empréstimo");
		for (Livro livro : catalogoLivros) {
			if(!livro.isDisponibilidade()) {
				System.out.println(livro.getTitulo());
			}
		}
	}

}
