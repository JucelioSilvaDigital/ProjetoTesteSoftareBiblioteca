import java.util.ArrayList;

public class CatalogoLivros {
   private String nome; // nome do catalago
   private ArrayList <Livro> listaDeLivros = new ArrayList<>(); // lista de livros do catalago

//Mostra o nome do catalago
public String getNome() {
    return nome;
}
//cadastra um nome para o catalogo
public void setNome(String nome) {
    this.nome = nome;
}
//ver lista de livros do catalago
public ArrayList<Livro> getListaDeLivros() {
    return listaDeLivros;
}
//add livro ao catalago
public void setListaDeLivros(Livro livro) {
    this.listaDeLivros.add(livro);
}

   
}
