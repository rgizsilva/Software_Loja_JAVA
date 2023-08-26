package dados;

public class Produto {

    String nome;
    int codigo;
    int quantidade;

    public Produto() {
    }

    public Produto(String nome, int codigo, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
