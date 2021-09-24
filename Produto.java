package rec;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private double precodecusto;
    private double precodevenda;

    public Produto(String nome, double preco, int quantidade, double precodecusto, double precodevenda) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidade;
        this.precodecusto = precodecusto;
        this.precodevenda = precodevenda; 

    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidadeEstoque;
    }

    public double getPrecodecusto() {
        return this.precodecusto;
    }
    
    public double getPrecodevenda() {
        return this.precodevenda;
    }
    
    public void getLucrodoproduto(){
	    System.out.printf("Lucro do Produto: ", precodevenda - precodecusto);

    	
    }
   
}
