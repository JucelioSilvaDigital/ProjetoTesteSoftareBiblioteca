import java.util.ArrayList;

public class Usuario extends Pessoa {
    private Bibliotecaria responsavel; //pessoa que o cadastrou    
	private ArrayList<Livro> listaLivrosEmprestados = new ArrayList<>();

 

    public Usuario(Pessoa nomePessoa, Bibliotecaria responsavel) {
        super(nomePessoa);
        this.responsavel = responsavel;
    }


    //mostra o responsavel pelo cadatro do usuario
    public Bibliotecaria getResponsavel() {
        return responsavel;
    }


    //cadastra o responsavel pelo cadastro do usuario
    public void setResponsavel(Bibliotecaria responsavel) {
        this.responsavel = responsavel;
    }


    //mostra a lista de livros que o usuario pegou emprestado
    public ArrayList<Livro> getListaLivrosEmprestados() {
        return listaLivrosEmprestados;
    }


    //adiciona livro a lista de livros pego emprestado pelo usuario
    public void setListaLivrosEmprestados(Livro livro) {
        this.listaLivrosEmprestados.add(livro);
    }


}
