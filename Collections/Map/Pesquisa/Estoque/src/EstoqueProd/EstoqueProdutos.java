package EstoqueProd;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutosMap;
	
	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotal() {
		double valorTotalEstoque = 0;
		if(!estoqueProdutosMap.isEmpty()) {
			
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		} return valorTotalEstoque;
		
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p: estoqueProdutosMap.values()) {
				if(p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}
	
	public static void main(String[] args) {
		 EstoqueProdutos estoque = new EstoqueProdutos();

		    // Exibe o estoque vazio
		    estoque.exibirProdutos();

		    // Adiciona produtos ao estoque
		    estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
		    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
		    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
		    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
		    // Exibe os produtos no estoque
		    estoque.exibirProdutos();
		    System.out.println("valor no estoque: " +  estoque.calcularValorTotal());
		    
		    System.out.println("Produto com maior quantidade em valor no estoque: " +  estoque.obterProdutoMaisCaro());
	}
}
