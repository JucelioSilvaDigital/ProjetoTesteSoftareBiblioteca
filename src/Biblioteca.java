import java.util.ArrayList;

public class Biblioteca {
    private String nome;
	private ArrayList<CatalogoLivros> catalogoLivros = new ArrayList<>();
	private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private ArrayList<Bibliotecaria> listaBibliotecarias = new ArrayList<>();


    //mostra o nome da biblioteca
    public String getNome() {
        return nome;
    }
    //cadastra um nome para biblioteca
    public void setNome(String nome) {
        this.nome = nome;
    }
    //mostra um lista de catalagos de livros da biblioteca
    public ArrayList<CatalogoLivros> getCatalogoLivros() {
        return catalogoLivros;
    }
    //adiciona um catalago de livros a biblioteca
    public void setCatalogoLivros(CatalogoLivros catalogoLivros) {
        this.catalogoLivros.add(catalogoLivros);
    }
    //mostra uma lista de usuarios da biblioteca
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    //adiciona usuario a biblioteca
    public void setListaUsuarios(Usuario usuario) {
        this.listaUsuarios.add(usuario);
    }
    //mostra uma lista de bibliotecarias da biblioteca
    public ArrayList<Bibliotecaria> getListaBibliotecarias() {
        return listaBibliotecarias;
    }
    //adiciona bibliotecaria a biblioteca
    public void setListaBibliotecarias(Bibliotecaria bibliotecaria) {
        this.listaBibliotecarias.add(bibliotecaria);
    }
    
    
}
