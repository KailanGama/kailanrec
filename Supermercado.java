/*
Identifique as classes e implemente um programa para a seguinte especificação: “O
supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada
item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
pedido pode ser pago em dinheiro, cheque ou cartão.”

PROVA DE RECUPERAÇÃO - UNIDADE 1
Entrega até 23/09/2021 às 23:59

- Acrescente mais dois tipos de atributos na classe Produto, a seu critério,
  como por exemplo, um atributo para armazenar o preço de custo e outro para
  armazenar o preço de venda, usando encapsulamento.
- Acrescente um método na classe Produto para calcular o lucro do produto,
  que deve ser o preço de venda menos o preço de custo.
- Crie uma classe RepositórioPedidos que armazene os pedidos de um supermercado.
  Essa classe deve ser capaz de gerar um relatório de vendas do dia.
- A classe principal deve ser capaz de adicionar mais de um pedido, calcular o
  valor total de cada pedido e gerar o relatório de vendas ao final do di, incluíndo
  lucro adquirido.
*/

public class Supermercado {

  public static void main(String[] args) {

    Produto arroz = new Produto("Arroz", 5.00, 10);
    Produto feijao = new Produto("Feijão", 8.00, 10);
    Produto macarrao = new Produto("Macarrão", 4.00, 10);
    Produto acucar = new Produto("Açucar", 5.00, 10);

    Itens i1 = new Itens(0, arroz, 2);
    Itens i2 = new Itens(1, feijao, 3);
    Itens i3 = new Itens(2, macarrao, 1);
    Itens i4 = new Itens(3, acucar, 2);

    Pedido pedido = new Pedido(1, "Cartão de Crédito", 3);
    pedido.adicionarItem(i1);
    pedido.adicionarItem(i2);
    pedido.adicionarItem(i3);
    pedido.adicionarItem(i4);

    pedido.imprimir();

  }

}
