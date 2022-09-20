
import org.junit.Test;
import org.junit.Before;    
    
public class UsuarioTest {
    Biblioteca biblioteca;
    Usuario usuario;
    Bibliotecaria bibliotecaria;
    Livro livro;
    Exemplar exemplar;

    @Before
    public void setup() {
        biblioteca = new Biblioteca("Biblioteca teste");
        usuario = new Usuario("Usuario Teste");
        bibliotecaria = new Bibliotecaria(biblioteca, usuario);
        livro = new Livro(biblioteca, "titulo livro 01", "autor de teste");
        exemplar = new Exemplar(livro);
    }
        
    @Test
    public void test() {
        
    }
}
    