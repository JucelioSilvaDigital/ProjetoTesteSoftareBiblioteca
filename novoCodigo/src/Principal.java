
public class Principal {

	public static void main(String[] args) {
		//objeto biblioteca criado
		Biblioteca biblioteca1 = new Biblioteca("Biblioteca Municipal de PVA");
		//3 livros criados
		Livro livro1 = new Livro(biblioteca1, "Pequeno Principe","Antoine de Saint-Exupéry");
		Livro livro2 = new Livro(biblioteca1, "Um Estudo em Vermelho", "Sir Arthur Conan Doyle");
		Livro livro3 = new Livro(biblioteca1, "Memórias Póstumas de Brás Cubas", "Machado de Assis");
		//3 exemplares para o livro livro1
		Exemplar exemplar1 = new Exemplar(livro1);
		Exemplar exemplar2 = new Exemplar(livro1);
		Exemplar exemplar3 = new Exemplar(livro1);
		//2 exemplares para o livro livro2
		Exemplar exemplar4 = new Exemplar(livro2);
		Exemplar exemplar5 = new Exemplar(livro2);
		//1 exemplar para o livro livro3
		Exemplar exemplar6 = new Exemplar(livro3);
		//3 usuarios criados
		Usuario usuario1 = new Usuario("André Calisto");
		Usuario usuario2 = new Usuario("José");
		Usuario usuario3 = new Usuario("Jucelio Silva");
		//um funcionario sendo criado para biblioteca (bibliotecaria) 
		Bibliotecaria bibliotecaria1 = new Bibliotecaria(biblioteca1, usuario3);
		//Tentando emprestar livros sem cadastrar o usuario na biblioteca
		bibliotecaria1.emprestar(biblioteca1, usuario1, exemplar1);
		bibliotecaria1.emprestar(biblioteca1, usuario2, exemplar2);
		bibliotecaria1.emprestar(biblioteca1, usuario3, exemplar3);
		bibliotecaria1.emprestar(biblioteca1, usuario3, exemplar4);
		//adicionando os usuarios na biblioteca
		bibliotecaria1.addUsu(biblioteca1, usuario1);
		bibliotecaria1.addUsu(biblioteca1, usuario2);
		//tentando devolver um livro sem ter pego emprestado
		bibliotecaria1.devolver(biblioteca1, usuario1, exemplar1);
		//emprestando um livro
		bibliotecaria1.emprestar(biblioteca1, usuario2, exemplar1);
		//emprestando o mesmo livro/exemplar do usuario2 ao usuario3
		bibliotecaria1.emprestar(biblioteca1, usuario3, exemplar1);
		//emprestando o segundo exemplar para o mesmo usuario
		bibliotecaria1.emprestar(biblioteca1, usuario2, exemplar2);
		System.out.println("*******");
		//vammos ver a lista de livros emprestados e disponiveis
		bibliotecaria1.exibeLivrosDisponiveis(biblioteca1);
		System.out.println("*******");
		bibliotecaria1.exibeLivrosIndisponiveis(biblioteca1);
		System.out.println("*******");
		//Vamos esgotar os exemplares disponiveis do livro 3
		bibliotecaria1.emprestar(biblioteca1, usuario2, exemplar6);
		System.out.println("*******");
		//vammos ver a lista de livros emprestados e disponiveis
		bibliotecaria1.exibeLivrosDisponiveis(biblioteca1);
		System.out.println("*******");
		bibliotecaria1.exibeLivrosIndisponiveis(biblioteca1);
		
	}

}
