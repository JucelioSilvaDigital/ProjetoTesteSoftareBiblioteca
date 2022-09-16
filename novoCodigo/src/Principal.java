
public class Principal {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal de PVA");
		Livro livro1 = new Livro("Pequeno Principe","Antoine de Saint-Exupéry", "1234");
		Livro livro2 = new Livro("Um Estudo em Vermelho", "Sir Arthur Conan Doyle", "4321");
		Livro livro3 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", "7890");
		Usuario usuario = new Usuario("André Calisto");
		Usuario usuario2 = new Usuario("José");
		biblioteca.cadastrarLivro(livro1);
		biblioteca.cadastrarLivro(livro2);
		biblioteca.cadastrarLivro(livro3);
		biblioteca.cadastrarUsuario(usuario);
		biblioteca.cadastrarUsuario(usuario2);
		biblioteca.emprestar(usuario, livro1);
		biblioteca.exibeLivrosDisponiveis();
		biblioteca.exibeLivrosIndisponiveis();
		biblioteca.devolver(usuario, livro1);
		biblioteca.exibeLivrosDisponiveis();
	}

}
