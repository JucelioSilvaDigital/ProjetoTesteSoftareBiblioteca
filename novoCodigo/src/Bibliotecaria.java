public class Bibliotecaria {
    private Usuario bibliotecaria;

    public Bibliotecaria(Biblioteca biblioteca, Usuario bibliotecaria) {
        this.bibliotecaria = bibliotecaria;
        biblioteca.setAddBibliotecaria(this);
    }

    public void emprestar(Biblioteca biblioteca, Usuario usuario, Exemplar exemplar) {
        if (biblioteca.getListLivroNaBiblioteca().contains(exemplar.getLivro())) {
            if (exemplar.isEmprestado()) {
                System.out.println("Livro/exemplar já emprestado");
            } else if (usuario.getListaLivros().contains(exemplar.getLivro())) {
                System.out.println("Usuario já emprestou um exemplar deste mesmo livro!");
            } else if (!biblioteca.getListUsuariaoDaBiblioteca().contains(usuario)) {
                System.out.println("Usuario " + usuario.getNome() + " não está cadastrado na biblioteca!");
            } else {
                if (usuario.anexaLivroEmprestado(exemplar)) {
                    exemplar.setEmprestado(true);
                    exemplar.setUsuario(usuario);
                    System.out.println(exemplar.getLivro().getTitulo() + " Emprestado com sucesso!");
                } else {
                    System.out.println("Erro inesperado ao emprestar livro");
                }
            }

        } else {
            System.out.println("Esse Livro não existe na biblioteca");
        }

    }

    public void devolver(Biblioteca biblioteca, Usuario usuario, Exemplar exemplar) {
        if (biblioteca.getListLivroNaBiblioteca().contains(exemplar.getLivro())) {
            if (!exemplar.isEmprestado()) {
                System.out.println("Erro: Livro/exemplar encontra-se na prateleira");
            } else if (usuario.getListaLivros().size() < 1) {
                System.out.println("Usuário não possui livro a ser devolvido");
            } else if (!usuario.getListaLivros().contains(exemplar.getLivro())) {
                System.out.println("Usuário não está devolvendo o mesmo livro/exemplar");
            } else if(!biblioteca.getListUsuariaoDaBiblioteca().contains(usuario)){
                System.out.println("Usuario " + usuario.getNome() + " não está cadastrado na biblioteca!");
            }else {
                if (usuario.desanexaLivroEmprestado(exemplar)) {
                    exemplar.setEmprestado(false);
                    exemplar.setUsuario(null);
                    System.out.println("Devolução realizada com sucesso!");
                } else {
                    System.out.println("Erro inesperado ao devolver livro");
                }
            }

        } else {
            System.out.println("Esse livro não existe para devolução");
        }
    }

    public Usuario getBibliotecaria() {
        return bibliotecaria;
    }

    public void addUsu(Biblioteca biblioteca, Usuario usuario){
        biblioteca.setAddUsuarioNaBiblioteca(usuario);
    }


    public void exibeLivrosDisponiveis(Biblioteca biblioteca) {
		System.out.println("Livros Disponíveis para Empréstimo");
        biblioteca.atualizaStatus();
		for (Livro livro : biblioteca.getListLivroNaBiblioteca()) {
			if(livro.isDisponibilidade()) {
				System.out.println(livro.getTitulo());
			}
		}
	}
	
	public void exibeLivrosIndisponiveis(Biblioteca biblioteca) {
		System.out.println("Livros Indisponíveis para Empréstimo");
        biblioteca.atualizaStatus();
		for (Livro livro : biblioteca.getListLivroNaBiblioteca()) {
			if(!livro.isDisponibilidade()) {
				System.out.println(livro.getTitulo());
			}
		}
	}

}
