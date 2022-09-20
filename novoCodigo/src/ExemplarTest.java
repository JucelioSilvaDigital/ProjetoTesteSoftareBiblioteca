
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class ExemplarTest {
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
    public void test() {// definindo um livro para o exemplar
        assertEquals(true, exemplar.setLivro(livro));
    }

    @Test
    public void test2() {// setando 2x o mesmo exemplar
        // espera-se true porque será subscrito o valor anterior
        exemplar.setLivro(livro);
        assertEquals(true, exemplar.setLivro(livro));
    }

    @Test
    public void test3() {// gera um numero unico para o exemplar (EX.: exemplar++)
        // já temos um exemplar criado em public void setup(){}
        // Sendo assim esperamos o nr 2
        // O fato de sempre está sendo gerado um numero a frente é porque
        // a função setExemplarNum já foi chamada na criação do exemplar (no construtor)
        assertEquals(2, exemplar.setExemplarNum());
    }

    @Test
    public void test4() {// gera um numero unico para o exemplar (EX.: exemplar++)
        Exemplar exemplar2 = new Exemplar(livro);
        // Após criarmos o exemplar 2 esperamos um valor 3
        // Sendo assim esperamos o nr 2
        // O fato de sempre está sendo gerado um numero a frente é porque
        // a função setExemplarNum já foi chamada na criação do exemplar (no construtor)
        assertEquals(3, exemplar2.setExemplarNum());
    }

    @Test
    public void test5() {// ver status se emprestado
        //com exemplar disponivel
        assertEquals(false, exemplar.isEmprestado());
    }

    @Test
    public void test6() {// ver status se emprestado
        //com usuario cadastrado na biblioteca
        //e livro já emprestado
        bibliotecaria.addUsu(biblioteca, usuario);
        bibliotecaria.emprestar(biblioteca, usuario, exemplar);
        assertEquals(true, exemplar.isEmprestado());
    }

    @Test
    public void test7() {// ver status se emprestado
        //com usuario nao cadastrado na biblioteca
        //e livro já emprestado
        //bibliotecaria.addUsu(biblioteca, usuario);
        bibliotecaria.emprestar(biblioteca, usuario, exemplar);
        assertEquals(false, exemplar.isEmprestado());
    }
}
