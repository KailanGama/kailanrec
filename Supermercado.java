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

package rec;

import java.util.Scanner;

public class Supermercado {
	
			    public static void main(String[] args) {

					Scanner l = new Scanner(System.in);

			        Produto arroz = new Produto(1, "Arroz", 5.00, 10);
			        Produto feijao = new Produto(2, "Feijão", 8.00, 10);
			        Produto macarrao = new Produto(3, "Macarrão", 4.00, 10);
					Produto acucar = new Produto(4, "Açúcar", 5.00, 10);
					
					String sei = "N";
					do{
						String r; int id = 0, idProduto = 1, qtdItens, quantProd = 0, qualProd = 0; double troco;
						System.out.printf("\n\n\n\nProdutos disponíveis: ");

						arroz.getProduto();
						feijao.getProduto();
						macarrao.getProduto();
						acucar.getProduto();

						System.out.println(" ");

						System.out.printf("Deseja comprar algo (S/N): ");
						r = l.nextLine().toUpperCase();
					
						if(r.equals("N")){

							System.out.printf("\n\n Volte quando precisar :)!!\n\n");

						}else{

							String retirar = "N";

							Pedido pedido = new Pedido(idProduto++);

							System.out.printf("Digite quantos itens terá o seu pedido: ");
							qtdItens = l.nextInt();

							pedido.setqtdItens(qtdItens);
							
							while(qtdItens != 0){

								System.out.printf("Digite o número para o pedido: ");
								qualProd = l.nextInt();

								switch (qualProd) {
									case 1:
										System.out.printf("Digite qual a quantidade do produto: ");
										quantProd = l.nextInt();
										l.nextLine();
										Itens i1 = new Itens(id++, arroz, quantProd);
						
										pedido.adicionarItem(i1);
									break;
									
									case 2: 
										System.out.printf("Digite 1ual a quantidade do produto: ");
										quantProd = l.nextInt();
										l.nextLine();
										Itens i2 = new Itens(id++, feijao, quantProd);
						
										pedido.adicionarItem(i2);
									break;
									
									case 3: 
										System.out.printf("Digite qual a quantidade do produto: ");
										quantProd = l.nextInt();
										l.nextLine();
										Itens i3 = new Itens(id++, macarrao, quantProd);
					
										pedido.adicionarItem(i3);
									break;

									case 4: 
										System.out.printf("Digite qual a quantidade do produto: ");
										quantProd = l.nextInt();
										l.nextLine();
										Itens i4 = new Itens(id++, acucar, quantProd);
					
										pedido.adicionarItem(i4);
									break;

									
								}

								qtdItens -= 1;
							}

							pedido.imprimir();

							System.out.printf("\n\nDeseja retirar itens (S/N): ");
							retirar = l.nextLine().toUpperCase();

							switch (retirar) {
								case "N":
									System.out.printf("\nDigite qual a forma de pagamento (Dinheiro = 0 || Cartão = 1): ");
									pedido.setFormapagar(l.nextInt());

									if(pedido.getFormaPagamento().equals("Dinheiro")){
										System.out.println(" ");
										System.out.printf("Digite qual a quantia para o pagamento: ");
										troco = l.nextDouble();
										System.out.println(" ");

										if(troco > pedido.getValorTotal()){

											System.out.println("\nSeu troco = "+(troco-pedido.getValorTotal())+"\n");
											System.out.println("Volte sempre! \n\n");
											
										}else if(troco == pedido.getValorTotal()){

											System.out.println("Sem troco\n");
											System.out.println("Volte sempre! \n\n");

										}else{
											do{
												System.out.printf("\nQuantia é menor que o valor total!\n\n");
												System.out.println("\nO valor total é de: "+pedido.getValorTotal());
												System.out.println("\n\nPor favor, pague o valor correto!\n\n");
												System.out.printf("\nQual a quantia para o pagamento: ");
												troco = l.nextDouble();

											}while(troco < pedido.getValorTotal());

											if(troco > pedido.getValorTotal()){

												System.out.println("\nSeu troco = "+(troco-pedido.getValorTotal())+"\n");
												System.out.println("Volte sempre! \n\n");
												
											}else if(troco == pedido.getValorTotal()){
							
												System.out.println("\n\nSem troco\n");
												System.out.println("Volte sempre! \n\n");
							
											}
										}

										System.out.println("Fim do pedido");

									}else{
										System.out.println("Pagamento realizado!");
										System.out.println("Volte sempre! \n\n");
										System.out.println("Fim do pedido");
									}
									break;
							
								default:
									do{
										System.out.printf("\n\nDigite qual o número do produto quer retirar: ");
										pedido.retirarItem(l.nextInt());
										pedido.imprimir();

										l.nextLine();
										System.out.printf("\n\nDeseja retirar itens (S/N): ");
										retirar = l.nextLine().toUpperCase();
										l.nextLine();

									}while(retirar.equals("S"));

									System.out.printf("Qual a forma de pagamento (Dinheiro = 0 || Cartão = 1): ");
									pedido.setFormapagar(l.nextInt());

									switch (pedido.getFormaPagamento()){

										case "Dinheiro":

											System.out.println(" ");
											System.out.printf("Digite qual a quantia para o pagamento: ");
											troco = l.nextDouble();
											System.out.println(" ");

											if(troco > pedido.getValorTotal()){

												System.out.println("\nSeu troco = "+(troco-pedido.getValorTotal())+"\n");
												System.out.println("Volte sempre! \n\n");
												
											}else if(troco == pedido.getValorTotal()){

												System.out.println("Sem troco\n");
												System.out.println("Volte sempre! \n\n");

											}else{
												do{
													System.out.printf("\nQuantia é menor que o valor total!\n\n");
													System.out.println("\nO valor total é de: "+pedido.getValorTotal());
													System.out.println("\n\nPor favor, pague o valor correto!\n\n");
													System.out.printf("\nQual a quantia para o pagamento: ");
													troco = l.nextDouble();

												}while(troco < pedido.getValorTotal());

												if(troco > pedido.getValorTotal()){

													System.out.println("\nSeu troco = "+(troco-pedido.getValorTotal())+"\n");
													System.out.println("Volte sempre! \n\n");
													
												}else if(troco == pedido.getValorTotal()){
								
													System.out.println("\n\nSem troco\n");
													System.out.println("Volte sempre! \n\n");
								
												}
											}

											System.out.println("Fim do pedido");
										break;

										default:
											System.out.println("\n\nPagamento realizado!\n");
											System.out.println("Volte sempre! \n\n");
											System.out.println("Fim do pedido");
										break;
									}

								break;
							}
						}
						
						l.nextLine();
						System.out.printf("Deseja fazer outro pedido (S/N): ");
						sei = l.nextLine().toUpperCase();

					}while(sei.equals("S"));
					l.close();
			    }
			}
