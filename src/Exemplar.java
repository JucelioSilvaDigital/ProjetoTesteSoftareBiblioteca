public class Exemplar {
    private Livro livro;
    private String codExpemplar;
    private boolean disponibilidade;
    private Usuario usuarioQuePegou;

    //mostra o livro que pertence o exemplar
    public Livro getLivro() {
        return livro;
    }
    //define o livro que pertence o exemplar
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    //mostra o codigo do exemplar
    public String getCodExpemplar() {
        return codExpemplar;
    }
    //cadastra o codigo do exemplar
    public void setCodExpemplar(String codExpemplar) {
        this.codExpemplar = codExpemplar;
    }
    //mostra o status true/false
    public boolean isDisponibilidade() {
        return disponibilidade;
    }
    //atualiza a disponibilidade true/false
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    //mostra um objeto de usuario que pegou emprestado
    public Usuario getUsuarioQuePegou() {
        return usuarioQuePegou;
    }
    //cadastra o usuario que pegou emprestado 
    public void setUsuarioQuePegou(Usuario usuarioQuePegou) {
        this.usuarioQuePegou = usuarioQuePegou;
    }

    
}
