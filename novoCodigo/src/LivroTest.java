
import org.junit.Test;


import static org.junit.Assert.assertEquals;



import org.junit.Before;

public class LivroTest {
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
        // espera-se true porque temos um exemplar deste livri
        assertEquals(true, livro.isDisponibilidade());
    }

    @Test
    public void test2() {
        bibliotecaria.addUsu(biblioteca, usuario);
        bibliotecaria.emprestar(biblioteca, usuario, exemplar);
        biblioteca.atualizaStatus();
        // espera-se false porque o exemplar deste livro foi emprestado
        // e o status de livros foi atualizado
        assertEquals(false, livro.isDisponibilidade());
    }

    
}
