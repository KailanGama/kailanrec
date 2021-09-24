package rec;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private int id;
    private double precodecusto;
    private double precodevenda;

    public Produto(String nome, double preco, int quantidade, double precodecusto, double precodevenda, int id) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidade;
        this.precodecusto = precodecusto;
        this.precodevenda = precodevenda; 
        this.id = id;

    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setquant(int t) {
        this.quantidadeEstoque = this.quantidadeEstoque - t;
    }

    public double getPrecodecusto() {
        return this.precodecusto;
    }
    
    public double getPrecodevenda() {
        return this.precodevenda;
    }
    
    public void getProduto(){

        if(this.quantidadeEstoque > 0){
		    System.out.printf("\n\n\tNome: "+this.nome+"\n\tNúmero para pedido: "+this.id+"\n\tPreço: "+this.preco+"\n\tQuantidade em estoque: "+this.quantidadeEstoque);
        }else{
            System.out.printf("\n\n\tNome: "+this.nome+"\n\tNúmero para pedido: "+this.id+"\n\tPreço: "+this.preco+"\n\tSem estoque"); 
            
        }
        
        }
    
   
    public void getLucrodoproduto(){
	    System.out.printf("Lucro do Produto: ", precodevenda - precodecusto);

    	
    }
   
}
