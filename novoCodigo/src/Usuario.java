import java.util.ArrayList;

public class Usuario {
	private String nome;
	private ArrayList<Exemplar> listaLivros = new ArrayList<>();
	public Usuario(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Exemplar> getListaeExemplars() {
		return listaLivros;
	}
	public void setListaLivros(ArrayList<Exemplar> listaLivros) {
		this.listaLivros = listaLivros;
	}
	
	public boolean anexaLivroEmprestado(Exemplar exemplar) {
		listaLivros.add(exemplar);
		return true;
	}
	
	public boolean desanexaLivroEmprestado(Exemplar livro) {
		if(listaLivros.contains(livro)) {
			this.listaLivros.remove(livro);
			return true;
		}else {
			return false;
		}
	}

	public ArrayList<Livro> getListaLivros() {
		ArrayList<Livro> listaLivrosDoUsuario = new ArrayList<>();
		for(Exemplar livro : listaLivros){
			listaLivrosDoUsuario.add(livro.getLivro());
		}
		return listaLivrosDoUsuario;
	}



	


}
