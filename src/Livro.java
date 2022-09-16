import java.util.ArrayList;

public class Livro {
    private String titulo;
	private Autor autor;
	private String codUnico;
    private CatalogoLivros catalogoLivros;
    private ArrayList<Exemplar> listaCodExemplar = new ArrayList<>();

    

    //mostra o titulo do Livro
    public String getTitulo() {
        return titulo;
    }
    //cadastra um titulo para o Livro
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //mopstra um objeto de autor do Livro
    public Autor getAutor() {
        return autor;
    }
    //cadastra um objeto de autor para o Livro
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    //mostra um codigo unico para o Livro
    public String getCodUnico() {
        return codUnico;
    }
    //cadeastra um codigo unico para o Livro
    public void setCodUnico(String codUnico) {
        this.codUnico = codUnico;
    }
    //mostra uma lista de exemplares do livro
    public ArrayList<Exemplar> getListaCodExemplar() {
        return listaCodExemplar;
    }
    //adiciona um exemplar do livro
    public void setListaCodExemplar(Exemplar exemplar) {
        this.listaCodExemplar.add(exemplar);
    }
    //mostra o objeto catalago que o livro pertence
    public CatalogoLivros getCatalogoLivros() {
        return catalogoLivros;
    }
    //cadastra um catalago para o livro
    public void setCatalogoLivros(CatalogoLivros catalogoLivros) {
        this.catalogoLivros = catalogoLivros;
    }
    
	

    
    
    
}

