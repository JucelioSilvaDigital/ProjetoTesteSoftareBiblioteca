
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;    
    
public class BibliotecaTest {
    Biblioteca biblioteca;
    Usuario usuario;
    Bibliotecaria bibliotecaria;
    Livro livro;
    Exemplar exemplar;
    @Before
    public void setup(){
        biblioteca = new Biblioteca("Biblioteca teste");
        usuario = new Usuario("Usuario Teste");
        bibliotecaria = new Bibliotecaria(biblioteca, usuario);
        livro = new Livro(biblioteca, "titulo livro 01", "autor de teste");
        exemplar = new Exemplar(livro);
    }
        
    @Test
    public void test() {//cadastrar usuario
        assertEquals(true, biblioteca.cadastrarUsuario(usuario));
    }
    @Test
    public void test2() {//cadastrar usuario que já foi cadastrado anteriormente
        biblioteca.cadastrarUsuario(usuario);
        assertEquals(false, biblioteca.cadastrarUsuario(usuario));
    }

    @Test
    public void test3() {//cadastrar livro
        //espera-se false porque o livro está sendo adicionado no construtor de livros
        assertEquals(false, biblioteca.cadastrarLivro(livro));
    }

    @Test
    public void test4() {//cadastrar livro
        //espera-se false porque o livro está sendo adicionado no construtor de livros
        biblioteca.cadastrarLivro(livro);
        assertEquals(false, biblioteca.cadastrarLivro(livro));
    }
}
    