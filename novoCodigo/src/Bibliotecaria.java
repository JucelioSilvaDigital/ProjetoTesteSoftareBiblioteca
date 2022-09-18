public class Bibliotecaria {
    private Usuario bibliotecaria;

    // construtor
    public Bibliotecaria(Biblioteca biblioteca, Usuario bibliotecaria) {
        this.bibliotecaria = bibliotecaria;
        biblioteca.setAddBibliotecaria(this);
    }

    // empresta livro
    public void emprestar(Biblioteca biblioteca, Usuario usuario, Exemplar exemplar) {
        // verifica se o livre existe na biblioteca
        if (biblioteca.getListLivroNaBiblioteca().contains(exemplar.getLivro())) {
            // verifica se o exemplar está disponivel
            if (exemplar.isEmprestado()) {
                System.out.println("Livro/exemplar já emprestado");
                // verifica se o usuario já tomou emprestado um exemplar do livro
            } else if (usuario.getListaLivros().contains(exemplar.getLivro())) {
                System.out.println("Usuario já emprestou um exemplar deste mesmo livro!");
                // verifica se o usuário está cadastrado na biblioteca
            } else if (!biblioteca.getListUsuariaoDaBiblioteca().contains(usuario)) {
                System.out.println("Usuario " + usuario.getNome() + " não está cadastrado na biblioteca!");
            } else {
                // realiza o emprestimo
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

    // devolve livro
    public void devolver(Biblioteca biblioteca, Usuario usuario, Exemplar exemplar) {
        // verifica se o livro existe na biblioteca
        if (biblioteca.getListLivroNaBiblioteca().contains(exemplar.getLivro())) {
            // o livro que está tentando devolver, não havia sido emprestado
            if (!exemplar.isEmprestado()) {
                System.out.println("Erro: Livro/exemplar encontra-se na prateleira");
                // verifica se o usuario possui algum livro a devolver
            } else if (usuario.getListaLivros().size() < 1) {
                System.out.println("Usuário não possui livro a ser devolvido");
                // verifica se está devolvendo o livro correto
            } else if (!usuario.getListaLivros().contains(exemplar.getLivro())) {
                System.out.println("Usuário não está devolvendo o mesmo livro/exemplar");
                // verifica se o usuario está cadastrado
            } else if (!biblioteca.getListUsuariaoDaBiblioteca().contains(usuario)) {
                System.out.println("Usuario " + usuario.getNome() + " não está cadastrado na biblioteca!");
            } else {
                // realiza a devolução do livro
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

    // retorna nome da biblioteca
    public Usuario getBibliotecaria() {
        return bibliotecaria;
    }

    // adiciona usuario a biblioteca
    public void addUsu(Biblioteca biblioteca, Usuario usuario) {
        biblioteca.setAddUsuarioNaBiblioteca(usuario);
    }

    // exibe os livros disponiveis na biblioteca
    public void exibeLivrosDisponiveis(Biblioteca biblioteca) {
        System.out.println("Livros Disponíveis para Empréstimo");
        biblioteca.atualizaStatus();
        for (Livro livro : biblioteca.getListLivroNaBiblioteca()) {
            if (livro.isDisponibilidade()) {
                System.out.println(livro.getTitulo());
            }
        }
    }

    // exibe os livros indisponiveis
    public void exibeLivrosIndisponiveis(Biblioteca biblioteca) {
        System.out.println("Livros Indisponíveis para Empréstimo");
        biblioteca.atualizaStatus();
        for (Livro livro : biblioteca.getListLivroNaBiblioteca()) {
            if (!livro.isDisponibilidade()) {
                System.out.println(livro.getTitulo());
            }
        }
    }

}
