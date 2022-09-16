import java.util.ArrayList;

public class Usuario {
	private String nome;
	private ArrayList<Livro> listaLivros = new ArrayList<>();
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
	public ArrayList<Livro> getListaLivros() {
		return listaLivros;
	}
	public void setListaLivros(ArrayList<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}
	
	public void anexaLivroEmprestado(Livro livro) {
		listaLivros.add(livro);
	}
	
	public boolean desanexaLivroEmprestado(Livro livro) {
		if(listaLivros.contains(livro)) {
			listaLivros.remove(livro);
			return true;
		}else {
			return false;
		}
	}

}
