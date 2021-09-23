
public class Pedido {

    private int id;
    private Itens[] itens;
    private String formaPagamento;

    public Pedido(int id, String formaPagamento, int qtdItens) {
        this.id = id;
        this.formaPagamento = formaPagamento;
        this.itens = new Itens[qtdItens];
    }

    public void adicionarItem(Itens item) {
        this.itens[item.getId()] = item;
    }

    public int getId() {
        return id;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public double getValorTotal() {
        double valorTotal = 0;
        for (int i = 0; i < itens.length; i++) {
            // valorTotal = valorTotal + itens[i].getPreco();
            valorTotal += itens[i].getPreco();
        }
        return valorTotal;
    }

    public void imprimir() {
        System.out.println("Pedido: " + this.id);
        System.out.println("Forma de pagamento: " + this.formaPagamento);
        System.out.println("Itens: ");
        for (int i = 0; i < this.itens.length; i++) {
            System.out.println(
                    "\t" + this.itens[i].getId() + " - " + this.itens[i].getNome() + " - " + this.itens[i].getPreco());
        }
        System.out.println("Total: " + this.getValorTotal());
    }
}