
public class Itens {

    private int id;
    private Produto produto;
    private int quantidade;

    public Itens(int id, Produto produto, int quantidade) {
        this.id = id;
        this.produto = produto;
        if (quantidade > 0 && quantidade <= produto.getQuantidade()) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return produto.getNome();
    }

    public double getPreco() {
        return produto.getPreco();
    }

    public int getQuantidade() {
        return quantidade;
    }

}
