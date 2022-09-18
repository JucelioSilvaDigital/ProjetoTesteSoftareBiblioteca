public class Exemplar {
    private Livro livro;
    private int exemplarNum;
    private boolean isEmprestado;
    private Usuario usuario;

    // construtor
    public Exemplar(Livro livro) {
        this.livro = livro;
        setExemplarNum();
        this.isEmprestado = false;
        livro.setListaExemplares(this);
    }

    // mostra o livro do exemplar
    public Livro getLivro() {
        return livro;
    }

    // define um livro para o exempla
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    // mostra o numero unico do exemplar
    public int getExemplarNum() {
        return exemplarNum;
    }

    // gera um numero unico para o exemplar (numero unico por cada livro)
    private void setExemplarNum() {
        this.exemplarNum = this.livro.getListaExemplares().size() + 1;
        System.out.println("Exemplar " + exemplarNum + " cadastrado  com sucesso!");
    }

    // mostra se está empresprado ou nao (true/false)
    public boolean isEmprestado() {
        return isEmprestado;
    }

    // define o valor true/false - true->emprestado - false->nao emprestado
    public void setEmprestado(boolean isEmprestado) {
        this.isEmprestado = isEmprestado;
    }

    // mostra o usuario que pegou emprestado o livro
    public Usuario getUsuario() {
        return usuario;
    }

    // define o usuario que pegou emprestado o livro
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
