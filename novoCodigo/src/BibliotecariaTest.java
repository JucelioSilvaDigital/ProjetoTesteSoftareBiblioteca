
import org.junit.Test;

import static org.junit.Assert.assertEquals;


import org.junit.Before;    
    
public class BibliotecariaTest {
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
    public void test() {//emprestando para usuario não cadastrado
        assertEquals(false, bibliotecaria.emprestar(biblioteca, usuario, exemplar));
    }

    @Test
    public void test2() {//emprestando para usuario cadastrado
        bibliotecaria.addUsu(biblioteca, usuario);
        assertEquals(true, bibliotecaria.emprestar(biblioteca, usuario, exemplar));
    }

    @Test
    public void test3() {//emprestando o mesmo livro 2x
        bibliotecaria.addUsu(biblioteca, usuario);
        bibliotecaria.emprestar(biblioteca, usuario, exemplar);
        assertEquals(false, bibliotecaria.emprestar(biblioteca, usuario, exemplar));
    }

    @Test
    public void test4() {//devolver livro sem pegar emprestado
        assertEquals(false, bibliotecaria.devolver(biblioteca, usuario, exemplar));
    }
    @Test
    public void test5() {//devolver livro apos pegar emprestado
        bibliotecaria.addUsu(biblioteca, usuario);
        bibliotecaria.emprestar(biblioteca, usuario, exemplar);
        assertEquals(true, bibliotecaria.devolver(biblioteca, usuario, exemplar));
    }
    
}
    